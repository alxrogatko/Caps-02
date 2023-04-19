package com.rogatko.alx.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RegistrationPageController {
    @GetMapping("/registration_page")
    public String showRegistrationPage(){
        return "registration_page";

    }
}
