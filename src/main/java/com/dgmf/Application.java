package com.dgmf;

import com.dgmf.model.BankAccount;
import com.dgmf.model.CurrentAccount;
import com.dgmf.model.SavingAccount;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		BankAccount account1 = null;
		account1 = new CurrentAccount();
		account1.setCurrency("MAD");
		account1.setBalance(7600);
		System.out.println(account1);

		BankAccount account2 = new CurrentAccount("MAD", 1200, 400);
		System.out.println(account2);

		BankAccount account3 = new SavingAccount("MAD", 3256, 3.4);
		System.out.println(account3);

		System.out.println("********* HASCODE *********");
		System.out.println("Les 2 objets ont des Id différents");
		System.out.println("Hascode Account1 : " + account1.hashCode());
		System.out.println("Hascode Account2 : " + account2.hashCode());
		System.out.println("***************************");
		System.out.println("Les 2 objets ont les mêmes Id");
		account2.setAccountId(account1.getAccountId());
		System.out.println("Hascode Account1 : " + account1.hashCode());
		System.out.println("Hascode Account : " + account2.hashCode());
		System.out.println("2 OBJETS AYANT LE MEME ETAT (VALEURS D'ATTRIBUTS IDENTIQUES) ONT LE MEME HASCODE");


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
