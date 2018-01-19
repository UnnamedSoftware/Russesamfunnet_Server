package com.ntnu.unnamedSoftware.Service;

import java.awt.List;
import java.util.ArrayList;

import org.springframework.stereotype.Service;
import no.ntnu.unnamedSoftware.Entities.User;

@Service
public class UserService {
	
	private ArrayList<User> users;
	
	public UserService() {
		this.users = new ArrayList<>();
		users.add(new User("Øystein"));
	}
	
	
	public ArrayList<User> getUsers()
	{		
		return users;
	}

}
