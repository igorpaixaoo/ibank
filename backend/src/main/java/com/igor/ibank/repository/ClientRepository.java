package com.igor.ibank.repository;

import com.igor.ibank.entity.ClientBankEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<ClientBankEntity, Long> {

    ClientBankEntity findByEmail(String email);
}
