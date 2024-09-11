package com.student.studentintroduce.sevice.admin;

import com.student.studentintroduce.dto.ApiResponseDto;
import com.student.studentintroduce.exception.SpecialExceptional.UserAlreadyExistsException;

import java.io.IOException;

import com.student.studentintroduce.dto.AddUserDto;

public interface AdminService {

	ApiResponseDto addUser(AddUserDto adduserDto, Long userId) throws UserAlreadyExistsException, IOException;

}
