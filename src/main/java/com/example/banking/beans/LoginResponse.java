package com.example.banking.beans;


import com.example.banking.entity.User;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginResponse {
    private String status;
    private String statusMsg;
    private Integer statusCode;
    private User user;
}
