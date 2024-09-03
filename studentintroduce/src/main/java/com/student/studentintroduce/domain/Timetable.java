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
@Table(name = "Timetable")
public class Timetable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "timetable_seq")
	@Column(name = "timetableId", unique = true)
	private Long timetableId;
}
