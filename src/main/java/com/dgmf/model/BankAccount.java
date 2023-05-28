package com.dgmf.model;

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
}
