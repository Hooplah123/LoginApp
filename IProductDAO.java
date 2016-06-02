package com.loginapp.dao;

import java.util.List;

import com.loginapp.dto.Product;

public interface IProductDAO {

	public void insertProduct(Product product) throws Exception;

	public void update(Product product) throws Exception;

	public void delete(Product product) throws Exception;

	/**
	 * 
	 * @param product
	 * @return list of products that match parameter product
	 */
	public List<Product> fetchProduct(Product product);

	/**
	 * 
	 * @return a list of all plants
	 */
	public List<Product> fetchProduct();
	
}
