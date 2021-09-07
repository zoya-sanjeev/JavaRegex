package com.bridgelabz.userregistration;

import java.util.Scanner;
import java.util.regex.*;
public class UserRegistration {
	
	public static boolean nameValidation(String name) {
		String nameValidation="^[A-Z][a-z]{2,}$";
		return Pattern.matches(nameValidation, name);
	}

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter First name");
		String firstName=scanner.next();
		if(!nameValidation(firstName))
			System.out.println("Invalid format");
		

	}

}
