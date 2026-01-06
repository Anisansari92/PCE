package Exceptionalhandling;

import java.util.Scanner;

public class BankApp {
	public static void main(String[] args) {
		System.out.println("Enter your ac number");
		
		Scanner sc= new Scanner(System.in);
		int enternum = sc.nextInt();
		
		Bank bank = new Bank();
		bank.checkAccount(enternum);
	}
}

class Bank {
	int validAccount = 12345;

    public void checkAccount(int enteredNumber) {
        if (enteredNumber == validAccount) {
            System.out.println("Correct account number");
        } else {
            System.out.println("Incorrect account number");
        }
	}
}