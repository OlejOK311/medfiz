package com.example.medfiz.controller;

import com.example.medfiz.dao.entity.Role;
import com.example.medfiz.dao.entity.User;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @GetMapping("/")
    public String showMain(Model model) {
        return "main";
    }
    @GetMapping("/about")
    public String showAbout(Model model) {
        return "about";
    }
}
