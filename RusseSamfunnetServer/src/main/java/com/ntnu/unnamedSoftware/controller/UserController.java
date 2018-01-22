package com.ntnu.unnamedSoftware.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ntnu.unnamedSoftware.Service.UserService;

import no.ntnu.unnamedSoftware.Entities.Russ;


@Controller
public class UserController {
	
	private UserService userService;
	
	public UserController()
	{
		userService = new UserService();
		
	}
	
	@RequestMapping("/users")
    public ArrayList<Russ> getUsers()
    {
		ArrayList<Russ> users = new ArrayList<>();
		users = userService.getRuss();
		
		return users;
    }

}
