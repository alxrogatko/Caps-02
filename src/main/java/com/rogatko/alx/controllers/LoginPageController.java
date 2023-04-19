package com.rogatko.alx.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class LoginPageController {
    Model model;
    String visiblelogin;
    @GetMapping({"/","login","login_page"})
    public  String showLoginPage(){
       return "login_page";
    }
    @PostMapping("login_page")
    public String login(@RequestParam("login")String login,@RequestParam("password")String password,Model model){

        model.addAttribute("visiblelogin",login);//temp
        return "login_page";

    }
}
