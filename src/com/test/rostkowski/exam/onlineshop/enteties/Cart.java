package com.test.rostkowski.exam.onlineshop.enteties;

public interface Cart {
	
	boolean isEmpty();

	void addProduct(Product productById);

	Product[] getProducts();

	void clear();

}
