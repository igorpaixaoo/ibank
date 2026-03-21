package com.igor.ibank.controller;

import com.igor.ibank.entity.ClientBankEntity;
import com.igor.ibank.service.ClientBankLoginService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpClientErrorException;

@RestController
@CrossOrigin("*")
public class LoginController {

    private final ClientBankLoginService clientBankLoginService;

    public LoginController(ClientBankLoginService clientBankLoginService) {
        this.clientBankLoginService = clientBankLoginService;
    }

    @GetMapping("/login")
    public ClientBankEntity login(@RequestParam("account") String account, @RequestParam String password){
        //if(!account.isBlank()){
            return clientBankLoginService.getClientBankEntity(account, password);
        //}else throw new HttpClientErrorException(HttpStatus.NOT_FOUND, "Account not found");
    }
}
