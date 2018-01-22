package no.ntnu.unnamedSoftware.controller;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import no.ntnu.unnamedSoftware.Entities.Russ;
import no.ntnu.unnamedSoftware.Entities.School;
import no.ntnu.unnamedSoftware.Service.UserService;


@Controller
public class UserController {
	
	private UserService userService;
	
	public UserController()
	{
		userService = new UserService();
		
	}
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@RequestMapping("/users")
    public ArrayList<Russ> getUsers()
    {
		ArrayList<Russ> users = new ArrayList<>();
		users = userService.getRuss();
		
		return users;
    }
	
	
	
	@RequestMapping("/schools")
	@Transactional
	public School getSchools() {
		Session currentSession = sessionFactory.openSession();
		
		Query theQuery = currentSession.
				createQuery("from School s"); 
		
		List<School> userInfo = theQuery.list();
		School s = userInfo.get(0);
		return s;
	}


}
