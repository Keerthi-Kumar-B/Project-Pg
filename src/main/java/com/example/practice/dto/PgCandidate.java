package com.example.practice.dto;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class PgCandidate implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int canditateId;
	private String name;
	private int roomNo;

}
