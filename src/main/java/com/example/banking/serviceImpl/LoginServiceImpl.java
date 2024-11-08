package com.example.banking.serviceImpl;

import com.example.banking.beans.LoginRequest;
import com.example.banking.beans.LoginResponse;
import com.example.banking.entity.User;
import com.example.banking.repository.UserDao;
import com.example.banking.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class LoginServiceImpl implements UserService {

    @Autowired
    UserDao userDao;
    @Override
    public LoginResponse userLogin(LoginRequest loginRequest) {
        System.out.println("entered user login");
        LoginResponse loginResponse = new LoginResponse();
        String email = loginRequest.getEmail();
        String password = loginRequest.getPassword();

        User user = userDao.findUserByEmail(email);
        if(user.getPassword().equals(password)){
            loginResponse.setStatus("Success");
            loginResponse.setStatusCode(200);
            loginResponse.setStatusMsg("Logged in successfully");
            loginResponse.setUser(user);
            return loginResponse;


        }
        else {
            loginResponse.setStatusMsg("Wrong credentials ");
            loginResponse.setStatus("Failed");
            loginResponse.setStatusCode(400);
            return loginResponse;

        }


    }

    @Override
    public List<User> getUser() {
        List<User> user = userDao.findAll();
        return user;
    }
}
