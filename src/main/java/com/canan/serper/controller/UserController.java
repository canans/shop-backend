package com.canan.serper.controller;

import com.canan.serper.entity.Products;
import com.canan.serper.entity.User;
import com.canan.serper.service.ProductService;
import com.canan.serper.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public class UserController {
    @Autowired
    private UserService userService;

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/user")
    public List<User> findAllUser(){
        return userService.findAllUser();
    }


}
