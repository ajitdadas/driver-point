package com.driver.point.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.driver.point.dao.UserDao;
import com.driver.point.model.User;

@Service
public class UserService {

	@Autowired
	private UserDao userDao;

	@GetMapping
	public List<User> getUsers() {
		return userDao.findAll();
	}

	@GetMapping(value = "/{userId}")
	public Optional<User> getUser(@PathVariable("userId") int userId) {
		return userDao.findById(userId);
	}

}
