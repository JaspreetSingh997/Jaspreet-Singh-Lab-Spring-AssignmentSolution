package com.greatlearning.studentmanagementsystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.greatlearning.studentmanagementsystem.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	
	
	    public User getUserByUsername(String username);
}
