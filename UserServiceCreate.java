package com.coderscampus.lesson5;



public class UserServiceCreate {

	
	


Object  createUser(String[] strings) {
	System.out.println(strings[0]);
User user= new User();
user.setPassword(strings[1]);
user.setUsername(strings [0]);
user.setFirstName(strings[2]);

 user.getFirstName();
 user.getPassword();
 user.getUsername();
return user;
		
	
}
public String[]  parseText(String input)
{
String[] inputArray= new String[3];
inputArray=input.split(",");
return inputArray;
}}
