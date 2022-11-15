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
    @GetMapping("/mechanic")
    public String showMechanic(Model model) {
        return "mechanic";
    }
    @GetMapping("/mechanic/lr1")
    public String showMechanicLr1(Model model) {
        return "Laboratornaya_rabota_1";
    }
    @GetMapping("/mechanic/lr2")
    public String showMechanicLr2(Model model) {
        return "Laboratornaya_rabota_2";
    }
    @GetMapping("/mechanic/lr3")
    public String showMechanicLr3(Model model) {
        return "Laboratornaya_rabota_3";
    }
    @GetMapping("/mechanic/lr4")
    public String showMechanicLr4(Model model) {
        return "Laboratornaya_rabota_3a_1";
    }
}
