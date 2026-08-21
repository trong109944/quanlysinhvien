package com.example.quanlysinhvien;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@SpringBootApplication
public class QuanlysinhvienApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuanlysinhvienApplication.class, args);
		System.out.println("Hello World");
	}
		@GetMapping("hello")
	    public String hello() {
        return "Hello";
    }

}
