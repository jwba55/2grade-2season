package com.student.studentintroduce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.student.studentintroduce.domain.UserRole;

@Repository
public interface UserRoleRepository extends JpaRepository<UserRole, Long>{

    UserRole findByUserroleId(String username);

}
