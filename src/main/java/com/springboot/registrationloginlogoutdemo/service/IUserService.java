package com.springboot.registrationloginlogoutdemo.service;

import com.springboot.registrationloginlogoutdemo.dto.RegistrationDTO;
import com.springboot.registrationloginlogoutdemo.entity.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface IUserService extends UserDetailsService {
    User save(RegistrationDTO registrationDTO);
}
