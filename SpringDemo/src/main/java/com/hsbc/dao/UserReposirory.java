package com.hsbc.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hsbc.model.User;

@Repository
public interface UserReposirory extends JpaRepository<User, String> {
	
	User findByUserId(String userId);

}
