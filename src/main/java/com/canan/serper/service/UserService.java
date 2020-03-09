package com.canan.serper.service;


import com.canan.serper.entity.User;
import com.canan.serper.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> findAllUser(){
        return userRepository.findAll();
    }
}
