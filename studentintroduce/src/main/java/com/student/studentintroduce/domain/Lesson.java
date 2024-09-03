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
@Table(name = "Lesson")
public class Lesson {
	
	   @Id
	   @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "lesson_seq")
	   @Column(name = "lessonId", unique = true)
	   private Long lessonId;
	   
	   @Column(name = "lessonName")
	   private String lessonName;

}
