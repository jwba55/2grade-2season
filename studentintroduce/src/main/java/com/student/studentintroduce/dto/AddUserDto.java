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

	   private Long username;
	   private String password;
	   private String email;
	   private String name;
	   private Date birthday;
	   private Long phone;
	   private String address;
	   private String profileImage;
	   private Date userDate;
	   private Long gender;
	   private String role;
	   private String status;
	   private Long lessonId;
	   private Long userroleId;

    @Builder
    public AddUserDto(Long username, String password, String email, String name, Date birthday, Long phone, String address,
    		String profileImage, Date userDate, Long gender, String status, Long lessonId, Long userroleId) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.name = name;
        this.birthday = birthday;
        this.phone = phone;
        this.address = address;
        this.profileImage = profileImage;
        this.userDate = userDate;
        this.gender = gender;
        this.status = status;
        this.lessonId = lessonId;
        this.userroleId = userroleId;
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
