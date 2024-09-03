package com.student.studentintroduce.domain;

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
@Table(name = "Classroom")
public class Classroom {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "classroom_seq")
	@Column(name = "classroomId")
	private Long objectId;
	
	@Column(name = "classroomName")
	private String objectName;
	
	@Column(name = "classRole")
	private Long score;


}
