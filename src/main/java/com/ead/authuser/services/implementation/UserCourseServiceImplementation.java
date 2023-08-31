package com.ead.authuser.services.implementation;

import com.ead.authuser.repositories.UserCourseRepository;
import com.ead.authuser.services.UserCourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserCourseServiceImplementation implements UserCourseService {

    @Autowired
    UserCourseRepository userCourseRepository;
}
