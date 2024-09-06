package com.student.studentintroduce.dto;


import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;

import com.student.studentintroduce.domain.Lesson;

import lombok.Builder;
import lombok.Getter;

@Getter
public class AddUserDto {
	
	@Autowired
	UserRoleDto roleDto;

	private Long userId;
	   private String password;
	   private String email;
	   private String userName;
	   private Date birthday;
	   private Long phone;
	   private String address;
	   private String profileImage;
	   private Date userDate;
	   private Long gender;
	   private String role;
	   private String status;
	   private String lessonName;

    @Builder
    public AddUserDto(Long userId, String password, String email, String userName, Date birthday, Long phone, String address,
    		String profileImage, Date userDate, Long gender, String role, String status, String lessonName) {
        this.userId = userId;
        this.password = password;
        this.email = email;
        this.userName = userName;
        this.birthday = birthday;
        this.phone = phone;
        this.address = address;
        this.profileImage = profileImage;
        this.userDate = userDate;
        this.gender = gender;
        this.role = role;
        this.status = status;
        this.lessonName = lessonName;
    }

    public AddUserDto() {
    }

	public void setPassword(String password) {
		this.password = password;
	}
	
	public void setRole(String role) {
		this.role = roleDto.getRole();
	}
	
	public void setStatus(String status) {
		this.status = roleDto.getStatus();
	}

}
