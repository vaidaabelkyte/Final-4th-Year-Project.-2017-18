package com.tipTopBites.securityConfiguration;

import org.springframework.data.repository.CrudRepository;

import com.tipTopBites.domain.User;

public interface UserRepository extends CrudRepository <User, Long> {
	User findByUsername(String username);
	
	

}
