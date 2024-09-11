package com.student.studentintroduce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.studentintroduce.domain.Lesson;

public interface LessonRepository extends JpaRepository<Lesson, Long>{

}
