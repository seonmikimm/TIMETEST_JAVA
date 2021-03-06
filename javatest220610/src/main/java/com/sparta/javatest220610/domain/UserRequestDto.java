package com.sparta.javatest220610.domain;


import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class UserRequestDto {
    private final String email;
    private final String name;
    private final int age;
    private final boolean gender;

}
