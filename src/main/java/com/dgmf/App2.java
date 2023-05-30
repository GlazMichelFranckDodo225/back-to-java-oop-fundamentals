package com.dgmf;

import com.dgmf.model.BankAccount;

public class App2 {
    public static void main(String[] args) {
        // Création d'un tableau de "BankAccount" avec 4 éléments
        BankAccount[] accounts = new BankAccount[4];

        // Remplissage du tableau "accounts"
        accounts[0] = new BankAccount("US $", 5400);
        accounts[1] = new BankAccount("GB £", 1298);
        accounts[2] = new BankAccount("EUR €", 3200);
        accounts[3] = new BankAccount("JPY ¥", 2359);

        // ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
        // ==> On cherche à stocker un stocker un 5ième "account" dans un
        // "accounts" ayant été déclaré comme ayant 4 éléments
        accounts[4] = new BankAccount("SUI CHF", 7124);

        // Affichage des éléments du tableau "accounts"
        /*for (int i = 0; i < accounts.length; i++) {
            System.out.println(accounts[i].toString());
        }*/
        for (BankAccount account : accounts) {
            System.out.println(account.toString());;
        }

        // Affichage d'un
    }
}
