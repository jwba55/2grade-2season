package com.student.studentintroduce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.student.studentintroduce.domain.UserDo;

@Repository
public interface UserRepository extends JpaRepository<UserDo, Long>{


}
