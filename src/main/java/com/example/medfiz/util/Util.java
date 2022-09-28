package com.example.medfiz.util;

import com.example.medfiz.dao.entity.Role;
import com.example.medfiz.dao.entity.User;
import com.example.medfiz.service.DataService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Util {
    private final DataService dataService;
    private final PasswordEncoder passwordEncoder;

    public Util(DataService dataService, PasswordEncoder passwordEncoder) {
        this.dataService = dataService;
        this.passwordEncoder = passwordEncoder;
    }

    @PostConstruct
    public void testBd() {
        /*System.out.println("Начал работу метод testBd");
        User user = new User();
        user.setLogin("admin");
        user.setPassword("admin");
        user.setName("admin");
        user.setRole(Role.ADMIN);
        user.setPassword(passwordEncoder.encode(""));
        dataService.createUser(user);
        //System.out.println(dataService.getAllUsers());
        System.out.println("Завершение работы метода testBd");*/
    }
}
