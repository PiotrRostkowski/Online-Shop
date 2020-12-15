package com.test.rostkowski.exam.onlineshop;

import com.test.rostkowski.exam.onlineshop.menu.Menu;
import com.test.rostkowski.exam.onlineshop.menu.impl.MainMenu;

public class Main {
	
	public static final String EXIT_COMMAND = "exit";

	public static void main(String[] args) {
		Menu mainMenu = new MainMenu();
		mainMenu.start();

	}

}
