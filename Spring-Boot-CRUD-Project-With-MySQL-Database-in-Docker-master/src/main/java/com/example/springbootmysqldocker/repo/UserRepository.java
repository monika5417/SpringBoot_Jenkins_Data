package com.example.springbootmysqldocker.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springbootmysqldocker.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
}
