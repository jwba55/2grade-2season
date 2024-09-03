package com.student.studentintroduce.domain;

import java.util.Date;

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
@Table(name = "Dormitory")
public class Dormitory {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "domitory_seq")
	@Column(name = "domitoryId")
	private Long domitoryId;
	
	@Column(name = "domitoryDate")
	private Date domitoryDate;

}
