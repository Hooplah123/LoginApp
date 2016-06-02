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
public class AddNewProduct {
	
	@Inject
	Product product;
	
	@Inject
	IProductService productService;
	
	public String execute() {
		String returnValue = "success";
//		FacesContext currentInstance = FacesContext.getCurrentInstance();
		try {
			productService.save(product);
		}
		catch (Exception e) {
			e.printStackTrace();
			returnValue = "failure";
		}
		return returnValue;
	}
}
