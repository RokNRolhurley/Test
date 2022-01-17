package bankAcct;
import java.util.*;

public class bnkAcc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner input = new Scanner(System.in);
		
		int userChoice; 
		boolean quit = false;
		float balance =0f;
		do{
			prln("\n1. Deposit Money: ");	
			prln("\n2. Withdraw Money: ");
			prln("\n3. check balance: ");
			prln("\nEnter 0 to quit: ");
			userChoice = input.nextInt();
							
			switch(userChoice){
			case 1: 
				//deposit money
				float amount;
				prln("\nEnter the Amount: ");
				amount = input.nextFloat();
				balance += amount;
				break;
				
			case 2: 
				//Withdraw money

				prln("\nEnter the Amount to withdraw: ");
				amount = input.nextFloat();
				balance -= amount;
				
				break;	
				
			case 3: 
				//Check Balance
				prln("\nYour balance :" +balance);
				
				break;		
				
			case 0: 
				quit = true;	
			}
		}while(!quit); 
		prln("Bye");
	} 
	
	public static void prln(Object Anyobject){
		System.out.println(Anyobject);}

}
