package com.student.studentintroduce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.studentintroduce.domain.UserDo;

public interface UserRepository extends JpaRepository<UserDo, Long>{

}
