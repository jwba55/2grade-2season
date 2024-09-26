package com.student.studentintroduce.domain;

import java.util.Date;
import java.util.List;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
@Table(name = "Users")
public class UserDo {

   @Id
   @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "users_seq")
   @Column(name = "username", unique = true)
   private Long username;
   
   @Column(name = "password")
   private String password;
   
   @Column(name = "email")
   private String email;
   
   @Column(name = "name")
   private String name;
   
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
   
   @OneToOne(fetch =FetchType.LAZY)
   @JoinColumn(name = "userroleId", referencedColumnName = "userroleId")
   private UserRole userRole;
   
   @ManyToOne(fetch = FetchType.LAZY)
   @JoinColumn(name = "lessonId", referencedColumnName = "lessonId")
   private Lesson lesson;
   
   @Builder
   public UserDo(Long username, String password,String email, String name, Date birthday, Long phone, String address,
		   String profileImage, Date userDate, Long gender, UserRole userRole, Lesson lesson) {
	   this.username = username;
	   this.password = password;
	   this.email = email;
	   this.name = name;
	   this.birthday = birthday;
	   this.phone = phone;
	   this.address = address;
	   this.profileImage = profileImage;
	   this.userDate = userDate;
	   this.gender = gender;
	   this.userRole = userRole;
	   this.lesson = lesson;
   }
   
}
