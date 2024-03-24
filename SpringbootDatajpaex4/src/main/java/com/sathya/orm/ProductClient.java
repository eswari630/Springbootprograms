package com.sathya.orm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component

public class ProductClient  implements CommandLineRunner {
	@Autowired
	ProductRepository productRepository;
	
	@Autowired
	productMapper mapper;
	
	@override
	public void run(String...args) throws Exception{
		//model class data : having the values
		productDetails 	productDetails = new productDetails();
		 productDetails.setproId(1001);
		productDetails.setproName("Chitapadu");
		productDetails.setproPrice(220);
		
	}

		
	}
	
	
	

}
