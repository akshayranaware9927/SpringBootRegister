package com.regex.akshay.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.regex.akshay.models.User;
import com.regex.akshay.repository.UserRepository;

public class CustomUserDetailsService implements UserDetailsService {
@Autowired
private UserRepository userRepo;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
User user=userRepo.findByEmail(username);
if(user==null) {
	throw new UsernameNotFoundException("user not found");
}
return new CustomUserDetails(user);
	
	}

}
