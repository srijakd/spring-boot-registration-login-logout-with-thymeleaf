package com.springboot.registrationloginlogoutdemo.repo;

import com.springboot.registrationloginlogoutdemo.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
}
