package com.covid.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "slot")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Slot {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int srno;
	@DateTimeFormat(pattern = "dd-MM-yyyy")
	private Date date;
	@Column(name = "status")
	private boolean isBooked;
	
	
}
