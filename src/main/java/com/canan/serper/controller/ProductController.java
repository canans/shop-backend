package com.canan.serper.controller;

import com.canan.serper.entity.Products;
import com.canan.serper.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class ProductController {
    @Autowired
    private ProductService productService;
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/products")
    public List<Products> findAll(){
        return productService.findAllProduct();
    }

}
