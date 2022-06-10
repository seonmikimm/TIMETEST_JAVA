package com.sparta.javatest220610.domain;


import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor // 기본생성자 생성
@Entity
public class User extends Timestamped {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private int age;

    @Column(nullable = false)
    private boolean gender;

    public User (String email, String name, int age, boolean gender){
        this.email = email;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public User (UserRequestDto requestDto){
        this.email = requestDto.getEmail();
        this.name = requestDto.getName();
        this.age = requestDto.getAge();
        this.gender = requestDto.isGender();
    }

    public void update (UserRequestDto requestDto){
        this.email = requestDto.getEmail();
        this.name = requestDto.getName();
        this.age = requestDto.getAge();
        this.gender = requestDto.isGender();
    }

}
