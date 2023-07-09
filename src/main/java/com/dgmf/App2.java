package com.dgmf;

import com.dgmf.model.BankAccount;
import com.dgmf.model.CurrentAccount;
import com.dgmf.model.SavingAccount;
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
        accounts[0] = new CurrentAccount("US $", 5400, 500);
        accounts[1] = new CurrentAccount("GB £", 1298, 4300);
        accounts[2] = new SavingAccount("EUR €", 3200, 4.6);
        accounts[3] = new SavingAccount("JPY ¥", 2359, 4.3);

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
        bankAccountArrayList.add(new CurrentAccount("US $", 5400, 4500));
        bankAccountArrayList.add(new CurrentAccount("GB £", 1298, 2456));
        bankAccountArrayList.add(new SavingAccount("EUR €", 3200, 3));
        bankAccountArrayList.add(new SavingAccount("JPY ¥", 2359, 3.1));
        bankAccountArrayList.add(new CurrentAccount("GB £", 1298, 3269));

        // Affichage de la balance des éléments de la ArrayList "bankAccountArrayList"
        for (BankAccount account: bankAccountArrayList) {
            System.out.println(account.getBalance());
            // Simulation de l'application par le compilateur du "Late binding" ou Liaison tardive (ou retardée) :
            // les méthodes à exécuter sont déterminées à la création de l'objet et non de la classe
            /* if(account instanceof CurrentAccount) {
                System.out.println(((CurrentAccount) account).getType());;
            } else if (account instanceof SavingAccount) {
                System.out.println(((SavingAccount) account).getType());;
            } */

            // Exploitation du Polymorphisme (ou du "Late binding")
            /* La JVM décide automatiquement la méthode "getType()" à appeler selon le Type de l'Objet courant,
            c'est-à-dire que la JVM applique implicitement le "Late binding" à l'exécution */
            System.out.println(account.getType());

            // Par contre, pour afficher le Taux d'intérêt d'un "account", on est obligé d'écrire nous-même
            // le code adéquat puisque la méthode "getInterestRate()" n'existe pas dans un Objet "account"
            System.out.println(account.getInterestRate());
        }

        System.out.println("********* Tableaux dynamiques (Tableaux à Dimensions Variables) - Collections - Map *********");
        // Création d'une HasMap ==> listes de paires "Clé-Valeur" implémentant l'interface Map
        Map<String, BankAccount> bankAccountMap = new HashMap<>();
        // Remplissage la HashMap "bankAccountMap"
        bankAccountMap.put("cc1", new CurrentAccount("US $", 5400, 1478));
        bankAccountMap.put("cc2", new SavingAccount("GB £", 1298, 1.5));
        bankAccountMap.put("cc3", new CurrentAccount("EUR €", 3200, 3698));
        bankAccountMap.put("cc4", new SavingAccount("JPY ¥", 2359, 2.7));

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
