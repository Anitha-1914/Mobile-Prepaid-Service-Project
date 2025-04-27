package com.aits.mobileprepaidservice.repoo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aits.mobileprepaidservice.entity.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

	Optional<User> findByMobile(String mobile);
	Optional<User> findByEmail(String email);
}
