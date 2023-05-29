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

		// Méthode "equals()"
		System.out.println("******** equals() **********");
		// Comparaison de "account2" et "account3" ==> Retourne "false"
		System.out.println("Account2 = Account3 : " + account2.equals(account3));
		// On leur donne le même id
		account3.setAccountId(account2.getAccountId());
		// On les affiche
		System.out.println(account2);
		System.out.println(account3);
		/* Comparaison de "account2" et "account3" ==> Retourne quand même "false"
		malgré que les 2 objets ont des valeurs d'attributs toutes identiques
		==> La raison : la méthode "equals()" compare les références (adresses mémoires)
		des 2 objets et elles sont différentes ici (à cause de l'utilisation
		de l'opérateur "new" qui crée des objets en leur attribuant des adresses
		mémoires différentes */
		System.out.println("Account2 = Account3 : " + account2.equals(account3));

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
