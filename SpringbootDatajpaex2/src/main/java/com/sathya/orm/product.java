package com.sathya.orm;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class product {
	@Id
	private int proId;
	private String proName;
	private double proPrice;

}
