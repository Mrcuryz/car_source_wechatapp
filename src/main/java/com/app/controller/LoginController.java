package com.app.controller;

import com.app.entity.Login;
import com.app.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/logins")
public class LoginController {

    @Autowired
    private LoginService loginService;

    @GetMapping("/{id}")
    public Login getLoginById(@PathVariable Long id) {
        return loginService.getLoginById(id);
    }

    @GetMapping
    public List<Login> getAllLogins() {
        return loginService.getAllLogins();
    }
}