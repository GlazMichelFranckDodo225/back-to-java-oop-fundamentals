package com.dgmf;

import com.dgmf.model.BankAccount;

import java.util.ArrayList;
import java.util.List;

public class App2 {
    public static void main(String[] args) {
        System.out.println("********* Tableaux à Dimensions Fixes *********");
        // Création d'un tableau de "BankAccount" avec 4 éléments
        // Tableau à dimensions fixes
        BankAccount[] accounts = new BankAccount[4];

        // Remplissage du tableau "accounts"
        accounts[0] = new BankAccount("US $", 5400);
        accounts[1] = new BankAccount("GB £", 1298);
        accounts[2] = new BankAccount("EUR €", 3200);
        accounts[3] = new BankAccount("JPY ¥", 2359);

        // ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
        // ==> On cherche à stocker un stocker un 5ième "account" dans un
        // "accounts" ayant été déclaré comme ayant 4 éléments
        // accounts[4] = new BankAccount("SUI CHF", 7124);

        // Affichage des éléments du tableau "accounts"
        /*for (int i = 0; i < accounts.length; i++) {
            System.out.println(accounts[i].toString());
        }*/
        for (BankAccount account : accounts) {
            System.out.println(account.toString());;
        }

        System.out.println("********* Tableaux dynamiques (Tableaux à Dimensions Variables) - Collections - List *********");
        // Création d'une ArrayList ==> listes d'objets implémentant l'interface List
        List<BankAccount> bankAccountArrayList = new ArrayList<>();
        // Remplissage la ArrayList "bankAccountArrayList"
        bankAccountArrayList.add(new BankAccount("US $", 5400));
        bankAccountArrayList.add(new BankAccount("GB £", 1298));
        bankAccountArrayList.add(new BankAccount("EUR €", 3200));
        bankAccountArrayList.add(new BankAccount("JPY ¥", 2359));

        // Affichage de la balance des éléments de la ArrayList "bankAccountArrayList"
        for (BankAccount account: bankAccountArrayList) {
            System.out.println(account.getBalance());
        }
    }
}
