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
@Table(name = "Board")
public class Board {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "board_seq")
	@Column(name = "boardId")
	private Long boardId;
	
	@CreationTimestamp
	@Column(name = "writeDate")
	private Date writeDate;
	
	@Column(name = "title")
	private String title;
	
	@Column(name = "content")
	private String content;
	
}
