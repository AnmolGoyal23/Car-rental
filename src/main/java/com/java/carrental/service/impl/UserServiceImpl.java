package com.java.carrental.service.impl;

import com.java.carrental.model.UserRequest;
import com.java.carrental.service.api.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class UserServiceImpl implements UserService {

  @Override
  public UserRequest addUser(UserRequest request) {
    request.setId(request.getId());
    request.setName(request.getName());
    request.setEmail(request.getEmail());
    request.setAddress(request.getAddress());

    return request;
  }
}
