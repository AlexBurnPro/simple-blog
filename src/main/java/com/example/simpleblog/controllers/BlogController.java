package com.example.simpleblog.controllers;

import com.example.simpleblog.models.Post;
import com.example.simpleblog.repositories.PostRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

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

    @PostMapping("blog/add")
    public String addPostBlod(@RequestParam String title,
                              @RequestParam String anons,
                              @RequestParam String full_text,
                              Model model) {
        Post post = new Post(title, anons, full_text);
        postRepositories.save(post);
        return "redirect:/blog";
    }
}
