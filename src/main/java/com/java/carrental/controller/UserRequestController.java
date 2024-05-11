package com.java.carrental.controller;

import static com.java.carrental.common.CommonConstants.API_BASE;
import static com.java.carrental.common.CommonConstants.API_USER_REQUEST;

import com.java.carrental.model.UserRequest;
import com.java.carrental.service.api.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping(API_BASE)
public class UserRequestController {
    private final UserService userService;

    @Autowired
    UserRequestController(final UserService userService) {
        this.userService = userService;
    }
    
    @PostMapping(API_USER_REQUEST)
    ResponseEntity<UserRequest> addUser(@RequestParam final UserRequest request) {
      return ResponseEntity.ok(userService.addUser(request));
   }

}
