package com.regex.akshay.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.regex.akshay.models.User;

public interface UserRepository extends JpaRepository<User,Long> {

	User save(User user);
@Query("SELECT u FROM User u WHERE u.email = ?1")
	User findByEmail(String username);

}
