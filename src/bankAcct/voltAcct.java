package bankAcct;

import java.util.Scanner;
import java.util.*;

public class voltAcct {

	//private static double balance;
	
	
	//public Scanner = new Scanner; 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner input = new Scanner(System.in);
		
		
				 
			
		double balance =0;
		int choice =0;
		
		prln("Enter Your Name: ");
		String CusName = input.nextLine();
		
		prln("\n Enter your choice of number: \n 1.Balance \n 2.Deposit \n 3.Withdrawal \n   ");
		choice = input.nextInt();
		
		if( choice == 1){
		
			// balance
		prln("Your Initial Balance : ");
		
		prln("Your Balance is:" +balance);
		
		prln("\n Enter your choice of number: \n 1.Balance \n 2.Deposit \n 3.Withdrawal \n   ");
		choice = input.nextInt();
		}
		
		else if (choice == 2){
		//deposit
		
		prln("Enter how much you want to deposit: ");
		double deposit = input.nextDouble();	
		balance = balance + deposit;
		prln("Your Total Balance:" +balance);
		
		prln("\n Enter your choice of number: \n 1.Balance \n 2.Deposit \n 3.Withdrawal \n   ");
		choice = input.nextInt();
		
		}
		//withdrawal  
		else if (choice == 3){
			
		prln("Enter how much you want to withdraw: ");
		double Withdrawal = input.nextDouble();
		balance = balance - Withdrawal;
		prln("Your Total Balance:" +balance);
						
		prln("\nWELCOME " +CusName+ " Enter your choice of number: \n 1.Balance \n 2.Deposit \n 3.Withdrawal \n   ");
		choice = input.nextInt();
		}	
		
		else {prln("Thank You for Banking with US ");}
		
		
		// Ask user if he wants to retry with a scanner.
				 
				}				
	
	
	
	public static void prln(Object Anyobject){
		System.out.println(Anyobject);}

}
