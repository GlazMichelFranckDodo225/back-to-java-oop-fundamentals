package com.dgmf.model;

import java.util.Objects;
import java.util.UUID;

public class BankAccount {
    private String accountId;
    private double balance;
    private String currency;
    private AccountStatus status;

    public BankAccount() {
        this.accountId = UUID.randomUUID().toString();
        this.status = AccountStatus.CREATED;
    }

    public BankAccount(String currency, double initialBalance) {
        this();
        this.currency = currency;
        this.balance = initialBalance;
    }

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

    public AccountStatus getStatus() {
        return status;
    }

    public void setStatus(AccountStatus status) {
        this.status = status;
    }

    // toString() ==> méthode héritée de la classe "Object"
    // ==> retourne l'état de l'objet (valeurs de ses attributs) lorsque
    // qu'on demande à afficher l'objet
    // ===> peut être redéfinie selon nos besoins
    @Override
    public String toString() {
        return "BankAccount{" +
                "accountId='" + accountId + '\'' +
                ", balance=" + balance +
                ", currency='" + currency + '\'' +
                ", status=" + status +
                '}';
    }

    // Redéfinition de la méthode "equals()"
    @Override
    public boolean equals(Object accountInParam) {
        BankAccount account = (BankAccount) accountInParam;

        return this.getAccountId().equals(account.getAccountId()) ? true : false;
    }
}
