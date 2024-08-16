package com.app.service;

import com.app.entity.Login;

import java.util.List;

public interface LoginService {

    Login getLoginById(Long id);

    List<Login> getAllLogins();
}