package com.igor.ibank.entity;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import org.antlr.v4.runtime.misc.NotNull;

import java.time.LocalDate;

@Entity
@Table(name = "clients")
public class ClientBankEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @Column(length = 100)
    private String name;
    @NotNull
    @Column(length = 100)
    private String nameMother;
    @NotNull
    private String email;
    @NotNull
    @Column(length = 14)
    private String cpf;
    @NotNull
    @Column(length = 15)
    private String maritalStatus;
    @NotNull
    @Column(length = 20)
    private String phone;
    @NotNull
    @Column(length = 30)
    private String profession;
    @NotNull
    private String address;
    @NotNull
    @Column(length = 4)
    private String password;
    @Column(length = 8)
    private String accountNumber;
    @NotNull
    private LocalDate dateBirth;

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameMother() {
        return nameMother;
    }

    public void setNameMother(String nameMother) {
        this.nameMother = nameMother;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LocalDate getBirthday() {
        return dateBirth;
    }

    public void setDateBirth(LocalDate dateBirth) {
        this.dateBirth = dateBirth;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public String getPassword() {
        return password;
    }
}
