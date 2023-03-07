package service;

import org.springframework.stereotype.Service;

import entity.UserDetails;



@Service
public interface UserService {
	
	UserDetails login(UserDetails userDetails);

	boolean add(UserDetails user);
}
