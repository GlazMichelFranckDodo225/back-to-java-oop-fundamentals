package com.dgmf;

import com.dgmf.model.BankAccount;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		// Comparaisons de String
		// Création avec l'opérateur "new"
		System.out.println("********* Création avec l'opérateur \"new\" *********");
		String s1 = new String("Azerty");
		String s2 = new String("Azerty");
		System.out.println("S1 : " + s1);
		System.out.println("S2 : " + s2);
		System.out.println("S1 == S2 : " + (s1 == s2));
		System.out.println("S1 equals S2 : " + (s1 == s2));
		System.out.println("\n");
		// Création sans l'opérateur "new"
		System.out.println("********* Création sans l'opérateur \"new\" *********");
		String s3 = "Azerty";
		String s4 = "Azerty";
		System.out.println("S3 : " + s3);
		System.out.println("S4 : " + s4);
		System.out.println("S3 == S4 : " + (s3 == s4));
		System.out.println("S3 equals S4 : " + (s3 == s4));


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
