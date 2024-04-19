package com.springboot.registrationloginlogoutdemo.repo;

import com.springboot.registrationloginlogoutdemo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String username);
}
