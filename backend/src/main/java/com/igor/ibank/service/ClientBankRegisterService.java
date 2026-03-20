package com.igor.ibank.service;

import com.igor.ibank.entity.ClientBankEntity;
import com.igor.ibank.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientBankRegisterService {

    private final ClientRepository clientRepository;
    private final GenerateAccountBankClientService generateAccountBankClientService;

    public ClientBankRegisterService(ClientRepository clientRepository, GenerateAccountBankClientService generateAccountBankClientService) {
        this.clientRepository = clientRepository;
        this.generateAccountBankClientService = generateAccountBankClientService;
    }

    public List<ClientBankEntity> getClients(){
        return clientRepository.findAll();
    }

    public ClientBankEntity createClient(ClientBankEntity clientBankEntity){
        clientBankEntity.setAccountNumber(generateAccountBankClientService.accountBank());
        return clientRepository.save(clientBankEntity);
    }

    public ClientBankEntity findClientByEmail(String email){
        return clientRepository.findByEmail(email);
    }
}
