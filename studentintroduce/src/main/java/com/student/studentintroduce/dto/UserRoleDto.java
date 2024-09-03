package com.student.studentintroduce.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserRoleDto {
	
	private Long userRoleId;
	private String role;
	private String status;
	
	public void SetRole(String role) {
		this.role = role;
	}
	
	public void SetStatus(String status) {
		this.status = status;
	}

}
