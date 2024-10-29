package com.nit.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nit.entity.AppUser;

public interface AppUserRepository extends JpaRepository<AppUser, Long>{
	Optional<AppUser> findByEmail(String email);
}
