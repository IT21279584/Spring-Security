package com.example.springsecuritydemo.controller;

import com.example.springsecuritydemo.model.AuthenticationRequest;
import com.example.springsecuritydemo.model.Teacher;
import com.example.springsecuritydemo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/register")
public class RegistrationController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @PostMapping
    public Teacher register(@RequestBody Teacher teacher){

        String username  = teacher.getUsername();
        String password = teacher.getPassword();
        String role = teacher.getRole();
        Long id  = teacher.getId();

        String encrptedPassword = passwordEncoder.encode(password);

        Teacher user = new Teacher(id, username ,encrptedPassword, role);

        return userRepository.save(user);
    }
}
