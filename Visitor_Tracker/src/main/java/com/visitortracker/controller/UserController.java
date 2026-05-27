package com.visitortracker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.visitortracker.model.Users;
import com.visitortracker.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService service;

    @GetMapping("/login")
    public String loginPage() {
        return "user-login";
    }

    @PostMapping("/login")
    public String login(
            @RequestParam String username,
            @RequestParam String password,
            jakarta.servlet.http.HttpSession session) {

        Users user = service.login(username,password);

        if(user != null){

            session.setAttribute("adminUser", user);

            return "redirect:/dashboard";
        }

        return "user-login";
    }
    @GetMapping("/register")
    public String registerPage() {
        return "user-register";
    }

    @PostMapping("/register")
    public String register(Users user) {

        service.register(user);

        return "redirect:/user/login";
    }
}