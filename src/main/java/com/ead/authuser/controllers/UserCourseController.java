package com.ead.authuser.controllers;

import com.ead.authuser.clients.CourseClient;
import com.ead.authuser.dtos.CourseDto;
import com.ead.authuser.dtos.UserCourseDto;
import com.ead.authuser.models.UserCourseModel;
import com.ead.authuser.models.UserModel;
import com.ead.authuser.services.UserCourseService;
import com.ead.authuser.services.UserService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;
import java.util.UUID;

@Log4j2
@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class UserCourseController {

    @Autowired
    CourseClient courseClient;

    @Autowired
    UserService userService;

    @Autowired
    UserCourseService userCourseService;

    @GetMapping("user/{userId}/courses")
    public ResponseEntity<Object> getAllCoursesByUser(@PageableDefault(page = 0, size = 5, sort = "courseId", direction = Sort.Direction.ASC)
                                                                   Pageable pageable,
                                                               @PathVariable(value = "userId") UUID userId){

        Optional<UserModel> userModelOptional = userService.findById(userId);

        if(!userModelOptional.isPresent()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("User Not Found");
        }

        return ResponseEntity.status(HttpStatus.OK).body(courseClient.getAllCoursesByUser(userId, pageable));
    }

    @PostMapping("user/{userId}/courses-subscription")
    public ResponseEntity<Object> saveSubscriptionUserInCourse(@PathVariable(value = "userId") UUID userId,
                                                               @RequestBody @Valid UserCourseDto userCourseDto){

        Optional<UserModel> userModelOptional = userService.findById(userId);

        if(!userModelOptional.isPresent()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("User Not Found");
        }
        if(userCourseService.existsByUserAndCourseId(userModelOptional.get(), userCourseDto.getCourseId())){
            return ResponseEntity.status(HttpStatus.CONFLICT).body("Error: subscription already exists");
        }

        UserCourseModel userCourseModel = userCourseService.save(userModelOptional.get().convertToUserCourseModel(userCourseDto.getCourseId()));
        return ResponseEntity.status(HttpStatus.CREATED).body(userCourseModel);
    }

    @DeleteMapping("/users-course/{courseId}")
    public ResponseEntity<Object> deleteUserCourseByCourse(@PathVariable(value = "courseId") UUID courseId){

        if(!userCourseService.existsByCourseId(courseId)){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("UserCourse Not Found");
        }
        userCourseService.deleteUserCourseByCourse(courseId);

        return ResponseEntity.status(HttpStatus.NO_CONTENT).body("");
    }
}
