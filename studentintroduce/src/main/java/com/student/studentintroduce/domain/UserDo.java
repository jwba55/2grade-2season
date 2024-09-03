package com.student.studentintroduce.domain;

import java.util.Date;

import org.hibernate.annotations.CreationTimestamp;

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
@Table(name = "Users")
public class UserDo {

   @Id
   @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "users_seq")
   @Column(name = "userId", unique = true)
   private Long userId;
   
   @Column(name = "password")
   private String password;
   
   @Column(name = "email")
   private String email;
   
   @Column(name = "userName")
   private String userName;
   
   @Column(name = "birthday")
   private Date birthday;
   
   @Column(name = "phone")
   private Long phone;
   
   @Column(name = "address")
   private String address;
   
   @Column(name = "profileImage")
   private String profileImage;
   
   //가입일
   @CreationTimestamp
   @Column(name = "userDate")
   private Date userDate;
   
   @Column(name = "gender")
   private Long gender;
   
}
