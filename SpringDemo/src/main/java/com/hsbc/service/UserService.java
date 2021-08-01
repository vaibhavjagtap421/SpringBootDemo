package com.hsbc.service;

import java.util.List;

import javax.transaction.Transactional;

/**
 * 45147704
 * UserService class
 * 
 * */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hsbc.dao.UserReposirory;
import com.hsbc.model.User;

@Service
public class UserService {
	@Autowired
	private UserReposirory userReposirory;
	

   /**
    * register
    * @return save data to the database
    * */
	@Transactional
	public void addUser(User user) {
		userReposirory.save(user);
	}

	public List<User> getAllUser() {
		return userReposirory.findAll();

	}

	public User getById(String userId) {
		return userReposirory.findByUserId(userId);

	}
	
	public void deleteByUserId(String userId) {
		userReposirory.deleteById(userId);
	}
	
	

}
