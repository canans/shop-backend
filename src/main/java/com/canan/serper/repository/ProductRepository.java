package com.canan.serper.repository;

import com.canan.serper.entity.Products;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Products,Long> {

}
