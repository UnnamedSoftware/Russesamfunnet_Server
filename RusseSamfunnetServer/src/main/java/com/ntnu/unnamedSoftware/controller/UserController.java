package com.ntnu.unnamedSoftware.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ntnu.unnamedSoftware.Service.UserService;

import no.ntnu.unnamedSoftware.Entities.User;

@Controller
public class UserController {
	
	private UserService userService;
	
	public UserController()
	{
		userService = new UserService();
		
	}
	
	@RequestMapping("/users")
    public ArrayList<User> getUsers()
    {
		ArrayList<User> users = new ArrayList<>();
		users = userService.getUsers();
		
		return users;
    }

}
