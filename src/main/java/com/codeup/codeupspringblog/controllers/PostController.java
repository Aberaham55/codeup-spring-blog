package com.codeup.codeupspringblog.controllers;

import com.codeup.codeupspringblog.models.Post;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class PostController {

    @GetMapping("/posts")
    public String showAllPost(Model model) {
        List<Post> posts = new ArrayList<>();
        posts.add(new Post("Post 1", "This is post 1."));
        posts.add(new Post("Post 2", "This is post 2."));
        model.addAttribute("post", posts);
        return "post/index";
    }


    @GetMapping("/post")
    @ResponseBody
    public String index(){
        return "posts index page";
    }
    @GetMapping("/post/{id}")
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
    @GetMapping("/posts/{id}")
    public String showPost(@PathVariable("id") int id, Model model) {
        Post post = new Post("Post " + id, "This is post " + id + ".");
        model.addAttribute("post", post);
        return "posts/show";
    }
}
