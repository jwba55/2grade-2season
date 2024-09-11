package com.student.studentintroduce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.studentintroduce.domain.Lesson;
import com.student.studentintroduce.domain.UserDo;

public interface LessonRepository extends JpaRepository<Lesson, Long>{

}
