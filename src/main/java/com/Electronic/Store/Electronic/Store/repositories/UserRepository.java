package com.Electronic.Store.Electronic.Store.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Electronic.Store.Electronic.Store.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, String> {


	Optional<User> findByEmail(String email);

	List<User> findByNameContaining(String keyword);

}
