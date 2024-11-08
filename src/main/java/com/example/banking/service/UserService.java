package com.example.banking.service;

import com.example.banking.beans.LoginRequest;
import com.example.banking.beans.LoginResponse;
import com.example.banking.entity.User;

import java.util.List;

public interface UserService {
    LoginResponse userLogin(LoginRequest loginRequest);
    List<User> getUser();

}
