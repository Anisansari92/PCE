package Exceptionalhandling;// Customize input exception

import java.util.Scanner;


public class BankAppmain {
    public static void main(String[] args) {
    	Bank1 b1 = new Bank1();
    	b1.Banking();
       
        
        
    }
}
class Bank1{
	void  Banking() {
    AccountNo obj = new AccountNo();                                                  
    int attempts = 0 ;
    try{
    	obj.acceptInfo();
    	obj.verify();
    }catch(InvalidInputException e){
    	System.out.println("Wrong pin");
    	System.out.println("Attempt 2");
    	try {
    		obj.acceptInfo();
    		obj.verify();
    	}catch(InvalidInputException e1){
    		System.out.println("Wrong pin");
    		System.out.println("Final Attempt ");
    		try {
    			obj.acceptInfo();
    			obj.verify();
    		}catch(InvalidInputException e2){
    			System.out.println("Your ATM is blocked ");
    		}
	}	
  }
}

class AccountNo {

    int acc_no = 12345;   
    int pass = 1111;     

    int u_acc;            
    int a_pass;

    void acceptInfo() {
    	   Scanner sc = new Scanner(System.in);
    
    	   System.out.print("Enter Account Number: ");
    	   u_acc = sc.nextInt();
    	   
    	   System.out.print("Enter Password: ");
    	   a_pass = sc.nextInt();
    }	
    
    
    	// Method to verify account number and password
    	void verify() throws InvalidInputException{
    		if (u_acc == acc_no && a_pass == pass) {
    			System.out.println("Login Successful");
    			balance n = new balance();
    			n.bal();
    			n.trans();
    			
        } else {
           InvalidInputException e = new InvalidInputException();
           throw e;
        }	
    }	
}	
class balance{
		int b=1000; ;
		
		void	 bal() {
			
			System.out.println("This is your current balance : " + b);
		
	}
	void trans() {
		System.out.println("Please enter amount to withdrawl");
		Scanner sc = new Scanner (System.in);
		int w = sc.nextInt();
		int n = b-w;
		System.out.println("this is your current amt : " + n);
		
	}
}
class InvalidInputException extends Exception{
	public String getMessage() {
		return "Wrong credential";
	}
}}