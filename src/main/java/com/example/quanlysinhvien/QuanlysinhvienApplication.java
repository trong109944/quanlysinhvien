package com.example.quanlysinhvien;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/api")
public class QuanlysinhvienApplication {

    public static void main(String[] args) {
        SpringApplication.run(QuanlysinhvienApplication.class, args);
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello";
    }

    @GetMapping("/student/{id}")
    public String getStudent(@PathVariable int id) {
        return "Sinh viên có mã: " + id;
    }
	@GetMapping("/student")
	public String greet(@RequestParam String name) {
    return "Xin chào " + name;
}

	@GetMapping("/searchstudent")
	public String searchStudent(@RequestParam String name,
                         @RequestParam(defaultValue = "1") int age) {
    return "Tên=" + name + ", tuổi=" + age;
}
    @GetMapping("/sample-students")
    public Students getSampleStudent() {
    	return new Students(1, "Nguyễn Văn A", 20);
}
	@GetMapping("/studentall")
	public List<Students> getStudents() {
    List<Students> list = new ArrayList<>();
    list.add(new Students(1, "A", 20));
    list.add(new Students(2, "B", 21));
    return list;
}
	@GetMapping("/getstudent")
	public String getStudents(
        @RequestHeader(value = "Authorization", required = false) String authorization) {
    
    if (authorization == null) {
        return "Không có Authorization header!";
    }
    return "Authorization = " + authorization;
}

}