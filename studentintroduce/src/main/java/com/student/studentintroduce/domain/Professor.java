package com.student.studentintroduce.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Generated;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
@Table(name = "GradeTerm")
public class Professor {
	
	@Id
	@Column(name = "userroleId", unique = true)
	private Long userroleId;
	
	@MapsId(value = "userroleId")
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "userroleId")
	private UserRole userRole;
	
	@Column(name = "professor")
	private Long professor;
	
}
