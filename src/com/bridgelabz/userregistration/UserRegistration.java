package com.bridgelabz.userregistration;

import java.util.Scanner;
import java.util.regex.*;
public class UserRegistration {
	
	public static boolean nameValidation(String name) {
		String nameValidation="^[A-Z][a-z]{2,}$";
		return Pattern.matches(nameValidation, name);
	}
	
	public static boolean emailValidation(String email) {
		String emailValidation="^[a-zA-Z]{1,}[\\.\\_\\-\\+]?[a-zA-Z0-9]*[@]{1}[a-z0-9]+[.]{1}[a-z]+[.]?[a-z]{2}$";
		return Pattern.matches(emailValidation,email);
	}
	
	public static boolean phoneValidation(String phoneNumber) {
		String phoneValidation="^91\\s[0-9]{10}$";
		return Pattern.matches(phoneValidation,phoneNumber);
	}
	
	public static boolean passwordValidation(String password) {
		String passwordValidation="^(?=..*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).{8,}$";
		return Pattern.matches(passwordValidation,password);
	}

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter First name");
		String firstName=scanner.nextLine();
		while(!nameValidation(firstName)) {
			System.out.println("Invalid format. Enter again");
			firstName=scanner.nextLine();
		}
		
		System.out.println("Enter Last name");
		String lastName=scanner.nextLine();
		while(!nameValidation(lastName)) {
			System.out.println("Invalid format.Enter again");
			lastName=scanner.nextLine();
		}
		System.out.println("Enter email");
		String email=scanner.nextLine();
		while(!emailValidation(email)) {
			System.out.println("Invalid format. Enter again");
			email=scanner.nextLine();
		}
		System.out.println("Enter phone number");
		String phoneNumber=scanner.nextLine();
		while(!phoneValidation(phoneNumber)) {
			System.out.println("Invalid format. Enter again");
			phoneNumber=scanner.nextLine();
		}
		
		System.out.println("Enter password");
		String password=scanner.nextLine();
		//String[] passwords= {}
		while(!passwordValidation(password)) {
			System.out.println("Invalid format. Enter again");
			password=scanner.nextLine();
			
		}
		System.out.println("Email testing");
		String[] emails= {"abc@yahoo.com","abc-100@yahoo.com","abc.100@yahoo.com","abc111@abc.com","abc-100@abc.net","abc.100@abc.com.au","abc@1.com",
				"abc@gmail.com.com","abc+100@gmail.com","abc","abc@.com.my","abc123@gmail.a","abc123@.com","abc123@.com.com",".abc@abc.com","abc()*@gmail.com","abc@%*.com",
				"abc..2002@gmail.com","abc.@gmail.com","abc@abc@gmail.com","abc@gmail.com.1a","abc@gmail.com.aa.au"};
		for(int i=0;i<email.length();i++) {
			System.out.println(emailValidation(emails[i]));
		}

	}

	 

	

}

