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
	private String userNum;
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
	   private Long lessonId;
	   private Long userroleId;

    @Builder
    public AddUserDto(Long userId, String userNum, String password, String email, String userName, Date birthday, Long phone, String address,
    		String profileImage, Date userDate, Long gender, String status, Long lessonId, Long userroleId) {
        this.userId = userId;
        this.userNum = userNum;
        this.password = password;
        this.email = email;
        this.userName = userName;
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
