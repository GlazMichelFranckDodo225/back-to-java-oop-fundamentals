package com.dgmf.model;

// Modificateurs d'accès (visibilité) : "public", "protected", "package" et "package"
public class BankAccount {
    // par défaut (pas de visibilité précisée) ==> correspond à la
    // visibilité "package" ==> Attributs UNIQUEMENT accessibles depuis
    // les classes se trouvant dans le même package
    private String accountId;
    private double balance;
    private String currency;
    private String status;

    public BankAccount() {
        status = "CREATED";
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
