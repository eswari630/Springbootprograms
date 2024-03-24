package com.sathya.orm;

import java.sql.Date;
import java.time.LocalDate;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class product {
	@Id
	private int proid;
	private String proName;
	private double proprice;
	
	@CreatedDate
	private LocalDate createAt;
	
	@CreatedBy
	private String createBy;


		
	}
	


	
		
	
	}

