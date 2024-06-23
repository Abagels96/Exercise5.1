package com.coderscampus.lesson5;
import com.coderscampus.lesson2.User;


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
}
