package com.student.studentintroduce.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDto {

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
	   

    public void setProfileImage(String profileImage) {
        this.profileImage = profileImage;
    }



}
