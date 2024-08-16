package com.app.service.impl;

import com.app.entity.Login;
import com.app.mapper.LoginMapper;
import com.app.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private LoginMapper loginMapper;

    @Override
    public Login getLoginById(Long id) {
        return loginMapper.findById(id);
    }

    @Override
    public List<Login> getAllLogins() {
        return loginMapper.findAll();
    }
}