package com.todo.todo.service;

import org.springframework.stereotype.Service;

@Service
public class LoginService {

    public boolean validateUser(String userId, String password){
        return userId.equalsIgnoreCase("todoApp") && password.equalsIgnoreCase("dummy");

    }
}
