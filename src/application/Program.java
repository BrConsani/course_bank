package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter account number: ");
		int accountNumber = sc.nextInt();
		System.out.print("Enter account houlder: ");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.print("Is there an initial deposit value? (y/n) ");
		char resp = sc.next().charAt(0);
		
		while(resp != 'y' && resp != 'n') {
			System.out.print("Try again, is there an initial deposit value? (y/n) ");
			resp = sc.next().charAt(0);
		}
		
		
		Account account = null;
		
		
		if (resp == 'n') {
			account = new Account(accountNumber, name);
		}else if(resp == 'y') {
			System.out.println("Enter initial deposit value: ");
			double initDeposit = sc.nextDouble();
			account = new Account(accountNumber, name, initDeposit);
		}
		
		System.out.printf("%nAccount data:%n");
		System.out.println(account);
		
		System.out.printf("%nEnter a deposit value: ");
		double value = sc.nextDouble();
		account.addBalance(value);
		
		System.out.printf("%nUpdated Account data:%n");
		System.out.println(account);
		
		System.out.printf("%nEnter a withdraw value: ");
		value = sc.nextDouble();
		account.removeBalance(value);
		
		System.out.printf("%nUpdated Account data:%n");
		System.out.println(account);		
		
		sc.close();
	}

}
