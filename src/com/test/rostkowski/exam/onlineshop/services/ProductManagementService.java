package com.test.rostkowski.exam.onlineshop.services;

import com.test.rostkowski.exam.onlineshop.enteties.Product;

public interface ProductManagementService {
	
	Product[] getProducts();

	Product getProductById(int productIdToAddToCart);

}
