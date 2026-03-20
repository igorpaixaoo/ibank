package com.igor.ibank.service;

import com.igor.ibank.entity.ClientBankEntity;
import com.igor.ibank.repository.ClientRepository;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class GenerateAccountBankClientService {

    private Character[] numbersChars = {'1', '2', '3', '4', '5', '6', '7', '8', '9'};
    private Random random = new Random();

    private ClientRepository clientRepository;

    public GenerateAccountBankClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public String accountBank() {
        StringBuilder accountNumber = new StringBuilder();
        for(int i = 0; i < 7; i++){
            accountNumber.append(numbersChars[random.nextInt(numbersChars.length)]);
        }
        return accountNumber.substring(0, 5) + "-" + accountNumber.substring(5);
            //provável substituição de return else

    }
}
