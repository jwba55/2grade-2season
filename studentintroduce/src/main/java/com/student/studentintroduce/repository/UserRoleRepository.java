package com.student.studentintroduce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.studentintroduce.domain.UserRole;

public interface UserRoleRepository extends JpaRepository<UserRole, Long>{

    UserRole findByUserroleId(Long userId);

}
