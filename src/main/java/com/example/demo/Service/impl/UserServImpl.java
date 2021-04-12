package com.example.demo.Service.impl;

import com.example.demo.Repo.UserRepo;
import com.example.demo.Service.UserServIn;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServImpl implements UserServIn {

    @Autowired
    private UserRepo userRepo;
}
