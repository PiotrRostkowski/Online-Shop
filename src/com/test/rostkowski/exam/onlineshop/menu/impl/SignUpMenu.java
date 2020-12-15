package com.test.rostkowski.exam.onlineshop.menu.impl;

import java.util.Scanner;

import com.test.rostkowski.exam.onlineshop.configs.ApplicationContext;
import com.test.rostkowski.exam.onlineshop.enteties.User;
import com.test.rostkowski.exam.onlineshop.enteties.impl.DefaultUser;
import com.test.rostkowski.exam.onlineshop.menu.Menu;
import com.test.rostkowski.exam.onlineshop.services.UserManagementService;
import com.test.rostkowski.exam.onlineshop.services.impl.DefaultUserManagementService;

public class SignUpMenu implements Menu {
	private UserManagementService userManagementService;
	private ApplicationContext context;

	{
		userManagementService = DefaultUserManagementService.getInstance();
		context = ApplicationContext.getInstance();
	}

	@Override
	public void start() {
		printMenuHeader();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Please, enter your first name: ");
		String firstName = sc.next();
		System.out.print("Please, enter your last name: ");
		String lastName = sc.next();
		System.out.print("Please, enter your password: ");
		String password = sc.next();
		System.out.print("Please, enter your email: ");
		
		sc = new Scanner(System.in);
		String email = sc.nextLine();

		User user = new DefaultUser(firstName, lastName, password, email);
		
		String errorMessage = userManagementService.registerUser(user);
		if (errorMessage == null || errorMessage.isEmpty()) {
			context.setLoggedInUser(user);
			System.out.println("New user is created");
		} else {
			System.out.println(errorMessage);
		}

		context.getMainMenu().start();
	}

	@Override
	public void printMenuHeader() {
		System.out.println("***** SIGN UP *****");		
	}

}
