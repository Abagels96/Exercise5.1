package com.coderscampus.lesson5;

import java.util.Arrays;

public class UserApplication {

	
	public static void main (String[]args) {
		
		String [] strings= new String[3];
			strings[0]="aUsernameHere";
			strings[1]="aPasswordHere";
			strings[2]="Somebodies Name";
			

		String input="exampleUsername, examplePassword, exampleName";	
		String blab="picnic, basket, potatoes, chicken";
		//System.out.println(strings[0]);
		UserServiceCreate userService= new UserServiceCreate();
		String flarf = userService.createUser(strings).toString();
		System.out.println(flarf);
	String[] array= userService.parseText(input);
	System.out.println(Arrays.toString(array));
	String[]anotherArray=userService.parseText(blab);
	System.out.println(Arrays.toString(anotherArray));
	}
		
	}

