package com.codeup.codeupspringblog.controllers;


import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    @GetMapping("/hello/{name}")
    @ResponseBody
    public String sayHello(@PathVariable String name, Model model)
    {
        model.addAttribute("name", name);
        return "Hello " + name;
    }
//other controller methods...

}
