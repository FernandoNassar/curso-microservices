package com.demo.project.hruser.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.project.hruser.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	User findByEmail(String email);
	
}
