package com.example.fullstack.backend.repository;

import com.example.fullstack.backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
