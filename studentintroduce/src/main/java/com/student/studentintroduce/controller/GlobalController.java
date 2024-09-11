package com.student.studentintroduce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.studentintroduce.dto.AddUserDto;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@Tag(name = "인증", description = "인증API")
@RestController
@RequestMapping("/api/public")
public class GlobalController {
    
    @Autowired
    AddUserDto addUserDto;

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody Long userId, @RequestBody String password) {
        
        return new ResponseEntity<>("로그인 성공", HttpStatus.OK);
    }
    
}
