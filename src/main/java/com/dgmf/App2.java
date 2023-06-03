package com.dgmf;

import com.dgmf.model.BankAccount;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App2 {
    public static void main(String[] args) throws JsonProcessingException {
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

        System.out.println("********* Tableaux dynamiques (Tableaux à Dimensions Variables) - Collections - Map *********");
        // Création d'une HasMap ==> listes de paires "Clé-Valeur" implémentant l'interface Map
        Map<String, BankAccount> bankAccountMap = new HashMap<>();
        // Remplissage la HashMap "bankAccountMap"
        bankAccountMap.put("cc1", new BankAccount("US $", 5400));
        bankAccountMap.put("cc2", new BankAccount("GB £", 1298));
        bankAccountMap.put("cc3", new BankAccount("EUR €", 3200));
        bankAccountMap.put("cc4", new BankAccount("JPY ¥", 2359));

        System.out.println("----- Affichage d'un élément de la HashMap \"bankAccountMap\" -----");
        System.out.println(bankAccountMap.get("cc1"));
        System.out.println("----- Parcours de la HasMap \"bankAccountMap\" en utilisant les Clés (Keys) -----");
        for (String key: bankAccountMap.keySet()) {
            System.out.println(bankAccountMap.get(key));
        }
        System.out.println("----- Parcours de la HasMap \"bankAccountMap\" en utilisant les Valeurs (Values) -----");

        System.out.println("----- Conversion des BankAccount au Format JSON -----");
        for (BankAccount account: bankAccountMap.values()) {
            // System.out.println(account);
            System.out.println(toJson(account));
        }
    }

    // Conversion des BankAccount au Format JSON
    public static String toJson(Object o) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();

        return objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(o);
    }
}
