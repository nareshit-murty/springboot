package com.nit.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nit.controller.MyUser;

public interface MyUserRepository extends JpaRepository<MyUser, Long>{
	Optional<MyUser> findByUsername(String username);
}
