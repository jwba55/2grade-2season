package com.student.studentintroduce.domain;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Builder;
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
	   
	   @OneToMany(mappedBy = "lesson", cascade = CascadeType.ALL, orphanRemoval = true)
	   private List<UserDo> userDo;
	   
	   @Builder
	   public Lesson(Long lessonId, String lessonName) {
		   this.lessonId = lessonId;
		   this.lessonName = lessonName;
	   }
	   

}
