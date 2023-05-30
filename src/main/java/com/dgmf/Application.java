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

		// Synthèse : "==", "hascode()" et "equals" (après redéfinition)
		System.out.println("+++++++ Synthèse : \"==\", \"hascode()\" et \"equals\" (après redéfinition) +++++++");
		System.out.println("******** Avant que Account2 et Account3 aient le même Id ********");
		System.out.println("Account2 == Account3 : " + (account2 == account3));
		System.out.println("Hascode Account2 : " + account2.hashCode());
		System.out.println("Hascode Account3 : " + account3.hashCode());
		System.out.println("Account2 equals (après redéfinition) Account3 : " + account2.equals(account3));
		// On leur donne le même id
		account3.setAccountId(account2.getAccountId());
		System.out.println("******** Maintenant Account2 et Account3 ont le même Id **********");
		System.out.println("Account2 == Account3 : " + (account2 == account3));
		System.out.println("Hascode Account2 : " + account2.hashCode());
		System.out.println("Hascode Account3 : " + account3.hashCode());
		System.out.println("Account2 equals (après redéfinition) Account3 : " + account2.equals(account3));


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
