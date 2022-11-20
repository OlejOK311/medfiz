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
    @GetMapping("/el_dyn")
    public String showElDyn(Model model) {
        return "el_dyn";
    }
    @GetMapping("/optic")
    public String showOptic(Model model) {
        return "optic";
    }
    @GetMapping("/szf")
    public String showSzf(Model model) {
        return "szf";
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
    @GetMapping("/mechanic/lr5")
    public String showMechanicLr5(Model model) {
        return "Laboratornaya_rabota_4";
    }

    @GetMapping("/el_dyn/lr6")
    public String showElDynLr6(Model model) {
        return "Laboratornaya_rabota_6";
    }
    @GetMapping("/el_dyn/lr7")
    public String showElDynLr7(Model model) {
        return "Laboratornaya_rabota_7";
    }

    @GetMapping("/optic/lr11")
    public String showOptic11(Model model) {
        return "Laboratornaya_rabota_11";
    }

    @GetMapping("/szf/base")
    public String showSzfBase(Model model) {
        return "szfBase";
    }
    @GetMapping("/szf/base/lr5")
    public String showSzfBaseLr5(Model model) {
        return "Laboratornaya_rabota_5";
    }
    @GetMapping("/szf/el_course")
    public String showSzfElCourse(Model model) {
        return "szfElCourse";
    }
    @GetMapping("/szf/el_course/lr1")
    public String showSzfElCourseLr1(Model model) {
        return "lr_szf_1";
    }
    @GetMapping("/szf/el_course/lr2")
    public String showSzfElCourseLr2(Model model) {
        return "lr_szf_2";
    }
    @GetMapping("/szf/el_course/lr3")
    public String showSzfElCourseLr3(Model model) {
        return "lr_szf_3";
    }
    @GetMapping("/szf/el_course/lr4")
    public String showSzfElCourseLr4(Model model) {
        return "lr_szf_4";
    }
}
