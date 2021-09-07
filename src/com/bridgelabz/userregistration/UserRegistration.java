package com.bridgelabz.userregistration;

import java.util.Scanner;
import java.util.regex.*;
public class UserRegistration {
	
	public static boolean nameValidation(String name) {
		String nameValidation="^[A-Z][a-z]{2,}$";
		return Pattern.matches(nameValidation, name);
	}
	
	public static boolean emailValidation(String email) {
		String emailValidation="abc(\\.[a-z]+)?\\@bl\\.co(\\.in)?";
		return Pattern.matches(emailValidation,email);
	}
	
	public static boolean phoneValidation(String phoneNumber) {
		String phoneValidation="91\\s[0-9]{10}";
		return Pattern.matches(phoneValidation,phoneNumber);
	}
	
	public static boolean passwordValidation(String password) {
		String passwordValidation="(?=.*[A-Z])[a-zA-Z]{8,}";
		return Pattern.matches(passwordValidation,password);
	}

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter First name");
		String firstName=scanner.next();
		while(!nameValidation(firstName)) {
			System.out.println("Invalid format. Enter again");
			firstName=scanner.next();
		}
		
		System.out.println("Enter Last name");
		String lastName=scanner.next();
		while(!nameValidation(lastName)) {
			System.out.println("Invalid format.Enter again");
			lastName=scanner.next();
		}
		System.out.println("Enter email");
		String email=scanner.next();
		while(!emailValidation(email)) {
			System.out.println("Invalid format. Enter again");
			email=scanner.next();
		}
		System.out.println("Enter phone number");
		String phoneNumber=scanner.next();
		while(!phoneValidation(phoneNumber)) {
			System.out.println("Invalid format. Enter again");
			phoneNumber=scanner.next();
		}
		
		System.out.println("Enter password");
		String password=scanner.next();
		while(!passwordValidation(password)) {
			System.out.println("Invalid format. Enter again");
			password=scanner.next();
			
		}

	}

	 

	

}
