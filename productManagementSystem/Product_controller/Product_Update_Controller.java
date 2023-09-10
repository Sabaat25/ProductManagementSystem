package com.productManagementSystem.Product_controller;

import com.productManagementSystem.dto.ProductDto;
import com.productManagementSystem.service.ProductService;

public class Product_Update_Controller { 
public static void main(String[] args) {
		ProductDto product = new ProductDto();
		product.setPid(1); 
		product.setBrand("CadBury");
		product.setName("SiLk");
		product.setPrice(250);

		ProductService productService = new ProductService();
		ProductDto p = productService.updateProductByPid(product);		
		if(p!=null) {
			System.out.println(p.getPid() + " Updated Sucessfull");
		}
	}
}
