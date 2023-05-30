package com.dgmf;

import com.dgmf.model.BankAccount;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		BankAccount account1;
		account1 = new BankAccount();

		account1.setCurrency("$ US");
		account1.setBalance(7600);

		BankAccount account2 = new BankAccount("£ GB", 1200);
		// Création d'un objet "account3" en passant les mêmes valeurs que
		// pour l'objet "account2"
		BankAccount account3 = new BankAccount("£ GB", 1200);

		/*printAccount(account1);
		printAccount(account2);
		printAccount(account3);*/

		// Méthode "hashCode()"
		System.out.println("******** Méthode \"hashCode()\" **********");
		// On affiche les hashcodes de "account2" et "account3"
		System.out.println("Hashcode Account2 = " + account2.hashCode());
		System.out.println("Hashcode Account3 = " + account3.hashCode());
		// On leur donne le même id
		account3.setAccountId(account2.getAccountId());
		// On les affiche
		System.out.println("Maintenant Account2 et Account3 ont le même Id");
		System.out.println("Hashcode Account2 = " + account2.hashCode());
		System.out.println("Hashcode Account3 = " + account3.hashCode());
		/* Comparaison de "account2" et "account3" ==> Retourne quand même "false"
		malgré que les 2 objets ont des valeurs d'attributs toutes identiques
		==> La raison : Méthode "hashCode()" prend aussi en compte les références
		(adresses mémoires) des 2 objets et elles sont différentes ici (à cause de
		l'utilisation de l'opérateur "new" qui crée des objets en leur attribuant
		des adresses mémoires différentes ==> chaque objet a son propre hascode à
		partir du moment où il a sa propre référence */


		SpringApplication.run(Application.class, args);
	}

	public static void printAccount(BankAccount account) {
		System.out.println("******** Bank Account **********");
		System.out.println("ID = " + account.getAccountId());
		System.out.println("Balance = " + account.getBalance());
		System.out.println("Status = " + account.getStatus());
		System.out.println("Currency = " + account.getCurrency());
		System.out.println("******** toString() **********");
		System.out.println("Account Status" + account);
	}
}
