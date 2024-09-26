package com.student.studentintroduce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.student.studentintroduce.domain.Lesson;

@Repository
public interface LessonRepository extends JpaRepository<Lesson, Long>{

}
