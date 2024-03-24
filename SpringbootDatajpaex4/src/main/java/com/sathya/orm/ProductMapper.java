package com.sathya.orm;

import org.springframework.stereotype.Component;

@Component
public class ProductMapper 
{
	//this method taking model class as input &return entity class as output
	public product modelToEntityConversion(PreoductDetails productDetails) {
		//read the data form model class set to entity class
		product product=new product();
		product.setProid(productDetails.getProID());
		product.setProid(productDetails.getProName());
		product.setProName(productDetails.getProPrice());
		product.setcreateBy(System.getProperty("User.name"));
		product.setcreateAt(LocalDateTime());
		return product;
	
	
		


}

	
}

	