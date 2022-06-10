package com.sparta.javatest220610.controller;

import com.sparta.javatest220610.domain.UserRepository;
import com.sparta.javatest220610.domain.UserRequestDto;
import com.sparta.javatest220610.service.UserService;
import lombok.RequiredArgsConstructor;
import org.apache.catalina.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class UserController {

    private final UserRepository userRepository;
    private final UserService userService;

    @PostMapping("/api/create")
    public User createuser(@RequestBody UserRequestDto requestDto){
        User user = new User(requestDto);
        return userRepository.save(user);
    }



}
