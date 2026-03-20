package com.igor.ibank.controller;

import com.igor.ibank.entity.ClientBankEntity;
import com.igor.ibank.service.ClientBankRegisterService;
import com.igor.ibank.service.GenerateAccountBankClientService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpClientErrorException;

import java.util.List;

@RestController
@CrossOrigin("*")
public class ClientController {

    private final ClientBankRegisterService clientBankRegisterService;

    public ClientController(ClientBankRegisterService clientBankRegisterService) {
        this.clientBankRegisterService = clientBankRegisterService;
    }

    @GetMapping("/clients")
    public List<ClientBankEntity> getClients(){
        return clientBankRegisterService.getClients();
    }

    @GetMapping("/findByEmail")
    public ClientBankEntity findClientByEmail(@RequestParam("email") String email){
        if(clientBankRegisterService.findClientByEmail(email) != null){
            return clientBankRegisterService.findClientByEmail(email);
        }else throw new HttpClientErrorException(HttpStatus.NOT_FOUND, "Client not found");
    }

    @PostMapping("/create")
    public ClientBankEntity postClient(@RequestBody ClientBankEntity clientBankEntity){
        if(clientBankEntity != null){
            return clientBankRegisterService.createClient(clientBankEntity);
        }else throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Bad Request");
    }
}
