package com.student.studentintroduce.domain;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
@Table(name = "SchoolObject")
public class SchoolObject {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "schoolObject_seq")
	@Column(name = "objectId")
	private Long objectId;
	
	@Column(name = "objectName")
	private String objectName;
	
	@Column(name = "grade")
	private String grade;
	
	@Column(name = "score")
	private Long score;
	
	@Column(name = "checkin")
	private Long checkin;
	
	@Column(name = "objectDay")
	private Date objectDay;


}
