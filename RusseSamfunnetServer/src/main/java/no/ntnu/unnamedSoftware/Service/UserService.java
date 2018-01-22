package no.ntnu.unnamedSoftware.Service;

import java.awt.List;
import java.util.ArrayList;

import org.springframework.stereotype.Service;

import no.ntnu.unnamedSoftware.Entities.Russ;

@Service
public class UserService {
	
	private ArrayList<Russ> users;
	
	public UserService() {
		this.users = new ArrayList<>();
	}
	
	
	public ArrayList<Russ> getRuss()
	{		
		return users;
	}

}
