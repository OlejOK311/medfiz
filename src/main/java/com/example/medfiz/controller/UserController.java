package com.example.medfiz.controller;

import com.example.medfiz.dao.entity.Role;
import com.example.medfiz.dao.entity.User;
import com.example.medfiz.service.DataService;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    private final DataService dataService;

    public UserController(DataService dataService) {
        this.dataService = dataService;
    }

    @GetMapping("/signup")
    public String showSignUpForm(User user) {
        return "add-user";
    }

    @PostMapping("/adduser")
    public String addUser(User user, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "add-user";
        }

        dataService.createUser(user);
        return "redirect:/index";
    }

    @GetMapping("/index")
    public String showUserList(Model model) {
        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        if (user.getRole().equals(Role.USER)) {
            model.addAttribute("users", dataService.getUserById(Long.valueOf(user.getId())));
        }
        else {
            model.addAttribute("users", dataService.getAllUsers());
        }
        return "index";
    }

    @GetMapping("/edit/{id}")
    public String showUpdateForm(@PathVariable("id") Long id, Model model) {
        User user = dataService.getUserById(id);

        model.addAttribute("user", user);
        return "update-user";
    }

    @GetMapping("/delete/{id}")
    public String deleteUser(@PathVariable("id") Long id, Model model) {
        User user = dataService.getUserById(id);
        dataService.removeUserById(id);
        return "redirect:/index";
    }

}
