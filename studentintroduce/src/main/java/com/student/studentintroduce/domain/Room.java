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
@Table(name = "Room")
public class Room {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "room_seq")
	@Column(name = "roomId")
	private Long roomId;
	
	@Column(name = "roomNum")
	private Long roomNum;
	
	@Column(name = "personNum")
	private Long personNum;
	
	@Column(name = "roomPersonNum")
	private Long roomPersonNum;
	
	@Column(name = "price")
	private Long price;
	
	
}
