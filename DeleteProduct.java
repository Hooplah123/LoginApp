package com.loginapp.ui;

import javax.faces.bean.ManagedBean;
import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.context.annotation.Scope;

import com.loginapp.dto.Product;
import com.loginapp.service.IProductService;

@Named
@ManagedBean
@Scope("session")
public class DeleteProduct {

	@Inject
	Product product;
	
	@Inject
	IProductService productService;
	
	public String execute() {
		String returnValue = "success";
		try {
			productService.delete(product);
		}
		catch (Exception e) {
			e.printStackTrace();
			returnValue = "failure";
		}
		return returnValue;
	}
}
