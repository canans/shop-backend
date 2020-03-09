package com.canan.serper.controller;

import com.canan.serper.entity.Category;
import com.canan.serper.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CategoryController {
    @Autowired
    private CategoryService categoryService;
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/category")
    public List<Category> findAll(){
        return categoryService.findAllCategory();
    }



}
