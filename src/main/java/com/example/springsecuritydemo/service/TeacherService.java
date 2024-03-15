package com.example.springsecuritydemo.service;

import com.example.springsecuritydemo.model.Teacher;
import com.example.springsecuritydemo.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class TeacherService {

    private UserRepository userRepository;

    public TeacherService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Teacher saveTeacher(Teacher teacher){
        return userRepository.save(teacher);
    }

}
