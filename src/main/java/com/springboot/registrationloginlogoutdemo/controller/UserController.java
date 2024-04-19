package com.springboot.registrationloginlogoutdemo.controller;

import com.springboot.registrationloginlogoutdemo.dto.RegistrationDTO;
import com.springboot.registrationloginlogoutdemo.service.IUserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/registration")
public class UserController {
    private final IUserService userService;

    public UserController(IUserService userService) {
        this.userService = userService;
    }

    @ModelAttribute("user")
    public RegistrationDTO userRegistrationDto() {
        return new RegistrationDTO();
    }

    @GetMapping
    public String showRegistrationForm() {
        return "registration";
    }

    @PostMapping
    public String registerUserAccount(@ModelAttribute("user") RegistrationDTO registrationDto) {
        try {
            userService.save(registrationDto);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return "redirect:/registration?email_invalid";
        }
        return "redirect:/registration?success";
    }
}
