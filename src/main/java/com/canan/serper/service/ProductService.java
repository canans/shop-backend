package com.canan.serper.service;

import com.canan.serper.entity.Products;
import com.canan.serper.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;
    public List<Products> findAllProduct(){

        return productRepository.findAll();
    }
}
