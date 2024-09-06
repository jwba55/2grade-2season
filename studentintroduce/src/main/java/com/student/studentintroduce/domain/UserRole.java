package com.student.studentintroduce.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
@Table(name = "UserRole")
public class UserRole {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "userrole_seq")
	@Column(name = "userroleId")
	private Long userroleId;
	
	@Column(name = "role")
	private String role;
	
	@Column(name = "status")
	private String status;
	
	
	@OneToOne(mappedBy = "userRole")
	private UserDo userDo;
	
	@OneToOne(mappedBy = "userRole")
	private Professor professor;
	
	@OneToOne(mappedBy = "userRole")
	private GradeTerm gradeTerm;

}
