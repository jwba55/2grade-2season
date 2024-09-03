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
@Table(name = "SchoolSchedule")
public class SchoolSchedule {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "schoolSchedule_seq")
	@Column(name = "scheduleId")
	private Long scheduleId;
	
	@Column(name = "scheduleDate")
	private Date sheduleDate;
	
	@Column(name = "scheduleContent")
	private String scheduleContent;

}
