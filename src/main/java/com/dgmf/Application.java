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

		printAccount(account1);
		printAccount(account2);

		SpringApplication.run(Application.class, args);
	}

	public static void printAccount(BankAccount account) {
		System.out.println("******** Bank Account **********");
		System.out.println("ID = " + account.getAccountId());
		System.out.println("Balance = " + account.getBalance());
		System.out.println("Status = " + account.getStatus());
		System.out.println("Currency = " + account.getCurrency());
		System.out.println("******************************");
	}
}
