package com.igor.ibank.service;

import com.igor.ibank.entity.ClientBankEntity;
import com.igor.ibank.repository.ClientRepository;
import org.springframework.stereotype.Service;

@Service
public class ClientBankLoginService {

    private final ClientRepository clientRepository;

    public ClientBankLoginService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public ClientBankEntity getClientBankEntity(String account, String password) {
        ClientBankEntity client = clientRepository.findByAccountNumber(account);

        if(account.equals(client.getAccountNumber()) && password.equals(client.getPassword())){
            return client;
        }else return null;

    }

}
