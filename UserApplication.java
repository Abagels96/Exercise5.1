package com.coderscampus.lesson5;



public class UserApplication {

	
	public static void main (String[]args) {
		
		String [] strings= new String[3];
			strings[0]="aUsernameHere";
			strings[1]="aPasswordHere";
			strings[2]="Somebodies Name";
			
			//System.out.println(strings[0]);
		UserServiceCreate userService= new UserServiceCreate();
		String flarf = userService.createUser(strings).toString();
		System.out.println(flarf);
	}
}
