package com.student.studentintroduce.controller.admin;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.studentintroduce.dto.AddUserDto;
import com.student.studentintroduce.dto.ApiResponseDto;
import com.student.studentintroduce.exception.SpecialExceptional.UserAlreadyExistsException;
import com.student.studentintroduce.sevice.admin.AdminService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.io.IOException;

import org.springframework.http.ResponseEntity;


@Tag(name = "관리자 페이지", description = "관리자 권한 활용")
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/admin")
public class AdminController {

	private final AdminService adminservice;
	
	@Operation(summary = "관리자의 회원등록 및 수정")
	@SecurityRequirement(name = "Baarer Authentication")
	@PutMapping("/user/put")
	public ResponseEntity<?> putUser(@RequestBody AddUserDto adduserDto) throws UserAlreadyExistsException, IOException{
		
		ApiResponseDto apiResponse = adminservice.putUser(adduserDto);
		
		return new ResponseEntity<>(apiResponse.getMessage(), apiResponse.getStatus());
	}
}
