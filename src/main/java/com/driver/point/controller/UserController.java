package com.driver.point.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.driver.point.model.User;
import com.driver.point.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;
	
	@GetMapping
	public List<User> getUsers() {
		return userService.getUsers();
	}

	@GetMapping(value = "/{userId}")
	public Optional<User> getUser(@PathVariable("userId") int userId) {
		return userService.getUser(userId);
	}

}
