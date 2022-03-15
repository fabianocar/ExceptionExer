package application;

import java.util.Scanner;

import model.entities.Account;
import model.exception.DomainException;

public class Program {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);

		System.out.println("Enter Account Data: ");
		System.out.println("Number: ");
		Integer number = sc.nextInt();
		System.out.println("Holder: ");
		String holder = sc1.nextLine();
		System.out.println("Balance: ");
		Double balance = sc1.nextDouble();
		System.out.println("Withdraw limit: ");
		Double withDrawLimit = sc1.nextDouble();
		
		Account acc = new Account(number, holder, balance, withDrawLimit);
		
		System.out.println("Enter amount withdraw: ");
		Double withDraw = sc.nextDouble();
		
		try {
		acc.withDraw(withDraw);
		System.out.printf("New balance: %.2f", acc.getBalance());
		}
		
		catch(DomainException e) {
			System.out.println("Withdraw error: " + e.getMessage());
		}
		
		sc.close();
		sc1.close();
	}

}
