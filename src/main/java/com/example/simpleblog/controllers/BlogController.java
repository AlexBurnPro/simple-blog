package com.example.simpleblog.controllers;

import com.example.simpleblog.models.Post;
import com.example.simpleblog.repositories.PostRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BlogController {

    @Autowired
    private PostRepositories postRepositories;

    @GetMapping("/blog")
    public String getBlog(Model model) {
        Iterable<Post> posts = postRepositories.findAll();
        model.addAttribute("posts", posts);
        return "blog-main";
    }

    @GetMapping("/blog/add")
    public String addBlog(Model model) {
        return "blog-add";
    }
}
