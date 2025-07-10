package com.example.HibernateSpringCache;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class HibernateSpringCacheApplication {

	public static void main(String[] args) {
		SpringApplication.run(HibernateSpringCacheApplication.class, args);
	}

}
