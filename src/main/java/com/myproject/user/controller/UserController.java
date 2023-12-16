package com.myproject.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class UserController {
    @RequestMapping(value = "/login")
    public String login(Model model){
        model.addAttribute("message", "ㅎㅇㅎㅇ");
        return "login";
    }

    @RequestMapping(value = "/register")
    public String register(Model model){
        return "register";
    }

    @PostMapping("/login")
    public void login2(){

    }
}
