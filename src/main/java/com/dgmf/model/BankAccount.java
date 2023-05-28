package com.dgmf.model;

public class BankAccount {
    // protected  ==> Attributs accessibles depuis l'intérieur la classe,
    // depuis les classes dérivées (classes filles)
    // et depuis les classes se trouvant dans le même package
    protected String accountId;
    protected double balance;
    protected String currency;
    protected String status;
}
