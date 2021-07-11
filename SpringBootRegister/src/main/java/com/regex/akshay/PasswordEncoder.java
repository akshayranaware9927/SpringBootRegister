package com.regex.akshay;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordEncoder {
	public static void main(String[]args) {
		BCryptPasswordEncoder encoder=new BCryptPasswordEncoder();
		String rawPassword="ravi2020";
		String encodedPassword=encoder.encode(rawPassword);
		System.out.println(encodedPassword);
	}

}
