package com.ead.authuser.services.implementation;

import com.ead.authuser.services.UtilsService;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UtilsServiceImplementation implements UtilsService {

    public String createUrl(UUID userId, Pageable pageable){
      return "/courses?userId=" + userId + "&page=" + pageable.getPageNumber() +
                "&size=" + pageable.getPageSize() + "&sort=" + pageable.getSort().toString().replaceAll(": ", ",");
    }


}
