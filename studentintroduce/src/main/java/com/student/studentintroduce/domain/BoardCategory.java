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
@Table(name = "BoardCategory")
public class BoardCategory {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "boardCategory_seq")
	@Column(name = "boardCategoryId")
	private Long boardCategoryId;
	
	@Column(name = "boardRole")
	private String boardRole;


}
