package com.dgmf.model;

import java.util.UUID;

public class BankAccount {
    // Attributs
    private String accountId;
    private double balance;
    private String currency;
    private String status;

    // Constructeur par défaut (sans paramètres)
    public BankAccount() {
        // Initialisation des attributs
        accountId = UUID.randomUUID().toString(); // Nombre aléatoire unique
        // dépendant de la Date Système
        status = "CREATED";
    }

    // Constructeur avec paramètres
    public BankAccount(String currency, double initialBalance) {
        // Appel du constructeur par défaut (sans paramètres)
        this();
        // Initialisation des attributs
        this.currency = currency;
        this.balance = initialBalance;
    }

    // Getters et Setters
    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
