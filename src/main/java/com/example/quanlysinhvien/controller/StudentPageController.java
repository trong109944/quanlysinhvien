package com.example.quanlysinhvien.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentPageController {

    @GetMapping({"/student", "/student-page"})
    public String studentPage() {
        return "student";
    }
}
