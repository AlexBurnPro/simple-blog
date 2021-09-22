package com.example.simpleblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BlogController {

    @GetMapping("/blog")
    public String getBlog(Model model) {
        model.addAttribute("title", "Блог сайта");
        return "blog-main";
    }
}
