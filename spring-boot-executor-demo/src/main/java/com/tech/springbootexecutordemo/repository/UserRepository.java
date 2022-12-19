package com.tech.springbootexecutordemo.repository;

import com.tech.springbootexecutordemo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
