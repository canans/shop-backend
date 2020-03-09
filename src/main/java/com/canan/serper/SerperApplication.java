package com.canan.serper;

import com.canan.serper.controller.UserController;
import com.canan.serper.entity.Category;
import com.canan.serper.entity.Products;
import com.canan.serper.entity.User;
import com.canan.serper.repository.CategoryRepository;
import com.canan.serper.repository.ProductRepository;
import com.canan.serper.repository.UserRepository;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@SpringBootApplication
public class SerperApplication {

	public static void main(String[] args) {
		SpringApplication.run(SerperApplication.class, args);
	}
	@Bean
	ApplicationRunner init(ProductRepository repository) {
		return args -> {
			repository.save(new Products(1L,"assda",45D,"https://images.unsplash.com/photo-1520256862855-398228c41684?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1050&q=80","sdsaasd"));
			repository.save(new Products(2L,"assda",45D,"https://images.unsplash.com/photo-1520256862855-398228c41684?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1050&q=80","sdsaasd"));
			repository.save(new Products(3L,"assda",45D,"https://images.unsplash.com/photo-1520256862855-398228c41684?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1050&q=80","sdsaasd"));
			repository.save(new Products(4L,"assda",45D,"https://images.unsplash.com/photo-1520256862855-398228c41684?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1050&q=80","sdsaasd"));

		};

	}
	@Bean
	ApplicationRunner category(CategoryRepository categoryRepository){
		return args -> {
			categoryRepository.save(new Category(1L,"Giyecek"));
			categoryRepository.save(new Category(2L,"Giyecek"));
			categoryRepository.save(new Category(3L,"Giyecek"));
			categoryRepository.save(new Category(4L,"Giyecek"));
			categoryRepository.save(new Category(5L,"Giyecek"));
			categoryRepository.save(new Category(6L,"Giyecek"));
			categoryRepository.save(new Category(7L,"Giyecek"));
			categoryRepository.save(new Category(8L,"Giyecek"));
			categoryRepository.save(new Category(9L,"Giyecek"));
		};
	}
	@Bean
	ApplicationRunner user(UserRepository userRepository){
		return args -> {
			userRepository.save(new User(1L,"canan","canan.serper@etiya.com","1234"));
		};
	}



}
