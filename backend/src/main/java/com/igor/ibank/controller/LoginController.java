package com.igor.ibank.controller;

import com.igor.ibank.entity.ClientBankEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @GetMapping("/login")
    public ClientBankEntity login(@RequestParam("account") String account, @RequestParam("password") String password){
        return null;
    }
}
