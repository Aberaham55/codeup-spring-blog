package com.codeup.codeupspringblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PostController {
    @GetMapping("/post")
    @ResponseBody
    public String index(){
        return "posts index page";
    }
    @GetMapping("/posts/{id}")
    @ResponseBody
    public String viewPost(@PathVariable int id){
        return "view an individual post";
    }
    @GetMapping("/post/create")
    @ResponseBody
    public String createPostForm(){
        return "view the form for creating a post";
    }
    @PostMapping("/post/create")
    @ResponseBody
    public String createPost(){
        return "create a new post";
    }
}
