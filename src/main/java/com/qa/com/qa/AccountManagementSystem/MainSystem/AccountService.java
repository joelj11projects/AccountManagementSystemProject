package com.qa.com.qa.AccountManagementSystem.MainSystem;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qa.com.qa.AccountManagementSystem.Interface.Repo;
import com.qa.com.qa.AccountManagementSystem.Model.User;

@Service
public class AccountService {

	@Autowired
	private Repo repo;
	
	public Collection<User> findAllUser() {
		List<User> users = new ArrayList<User>();
		for (User user : repo.findAll()) {
			users.add(user);
		}
		
		return users;
	}
	
}
