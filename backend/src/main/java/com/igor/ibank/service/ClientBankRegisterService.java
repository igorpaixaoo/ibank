package com.igor.ibank.service;

import com.igor.ibank.entity.ClientBankEntity;
import com.igor.ibank.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientBankRegisterService {

    @Autowired
    private ClientRepository clientRepository;

    public List<ClientBankEntity> getClients(){
        return clientRepository.findAll();
    }

    public ClientBankEntity createClient(ClientBankEntity clientBankEntity){
        return clientRepository.save(clientBankEntity);
    }

    public ClientBankEntity findClientByEmail(String email){
        return clientRepository.findByEmail(email);
    }
}
