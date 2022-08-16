package com.driver.point.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.driver.point.model.User;

public interface UserDao extends JpaRepository<User, Integer> {

}
