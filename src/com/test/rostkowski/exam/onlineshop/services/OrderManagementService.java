package com.test.rostkowski.exam.onlineshop.services;

import com.test.rostkowski.exam.onlineshop.enteties.Order;

public interface OrderManagementService {
	
	void addOrder(Order order);

	Order[] getOrdersByUserId(int userId);
	
	Order[] getOrders();

}
