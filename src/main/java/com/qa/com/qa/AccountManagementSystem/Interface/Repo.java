package com.qa.com.qa.AccountManagementSystem.Interface;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.qa.com.qa.AccountManagementSystem.Model.User;


@Repository
public interface Repo extends CrudRepository<User, Long> {
	
}