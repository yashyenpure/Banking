package com.example.banking.controller;


import com.example.banking.beans.LoginRequest;
import com.example.banking.beans.LoginResponse;
import com.example.banking.entity.User;
import com.example.banking.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("http://localhost:3000")
@RestController
@RequestMapping("/User")
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("userlogin")
    public LoginResponse userLogin(@RequestBody LoginRequest loginRequest){
        LoginResponse loginResponse = userService.userLogin(loginRequest);
        return loginResponse;

    }
    @GetMapping("getUsers")
    public List<User> getUsers(){
        System.out.println("inside get users controller");
        List<User> user = userService.getUser();
        return user;

    }

}
