package com.student.studentintroduce.domain;

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
@Table(name = "BoardComment")
public class BoardComment {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "comment_seq")
	@Column(name = "commentId")
	private Long commentId;
	
	@Column(name = "commentContent")
	private String commentContent;
	
}
