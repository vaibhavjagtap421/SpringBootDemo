package com.hsbc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hsbc.model.User;
import com.hsbc.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	
	@Autowired
	private UserService userService;
	@RequestMapping("/register")
	public ResponseEntity<Boolean> add(@RequestBody User user) {
		userService.addUser(user);
		return new ResponseEntity<Boolean>(Boolean.TRUE,HttpStatus.OK);
		
		
	}
	@RequestMapping("/getAllUser")
	public ResponseEntity<List<User>>getAllUser(){
		return new ResponseEntity<>(userService.getAllUser(),HttpStatus.OK);
	}
	@RequestMapping("/user/{useI}")
	public User getByUserId(@PathVariable("useI")String userId) {
		return userService.getById(userId);
		
	}
	@RequestMapping("/user/delete/{useI}")
	public void deleteByUserId(@PathVariable("useI")String userId) {
		userService.deleteByUserId(userId);
		
	}

}
