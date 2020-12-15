package com.test.rostkowski.exam.onlineshop.services;

import com.test.rostkowski.exam.onlineshop.enteties.User;

public interface UserManagementService {
	
String registerUser(User user);
	
	User[] getUsers();

	User getUserByEmail(String userEmail);

}
