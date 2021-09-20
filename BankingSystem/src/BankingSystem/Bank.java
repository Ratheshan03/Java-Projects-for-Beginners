package BankingSystem;

import java.util.Scanner;

/**
 * Represents a bank for managing customers and their bank accounts.
 * @author Rathe
 *
 */
public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// creates new instance of bank class
		Bank bank = new Bank();
		
		//calls the run method in the bank class
		bank.run();
	}
	
	/**
	 * runs the progress by initializing and managing bank accounts and customers.
	 */
	public void run() {
		System.out.println("Welcome to the Bank: what is your name? ");

		//create scanner to get user input
		Scanner scanner = new Scanner(System.in);

		//get the next token (word) which is the customer's name
		String name = scanner.next();

		System.out.println("Hello " + name + "! We are creating checking and saving accounts for you.");

		//create customer with given name
		Customer customer = new Customer(name);

		//get address
		System.out.println("what is your address? ");

		//get the next token (word) which is the customer address
		String address = scanner.next();

		//set the customer's address
		customer.setAddress(address);

		//create a checking account for customer
		BankAccount checkingAccount = new BankAccount("checking", customer);
		
		//create a savings account for customer
		BankAccount savingsAccount = new BankAccount("savings", customer);

		//gets and prints the customer info associated with the checking account
		System.out.println();
		System.out.println("Customer info: ");
		System.out.println(checkingAccount.getCustomerInfo());

		//get and print account info for checking account
		System.out.println("Checking account: ");
		System.out.println(checkingAccount.getAccountInfo());
		System.out.println("Savings account: ");
		System.out.println(savingsAccount.getAccountInfo());

		//deposits

		//into checking
		System.out.println("");
		System.out.println("Amount (decimal) to depost into your checking account?");
		double amount = scanner.nextDouble();
		checkingAccount.deposit(amount); //deposite into checking account

		//into saving
		System.out.println("");
		System.out.println("Amount (decimal) to depost into your saving account?");
		amount = scanner.nextDouble();
		savingsAccount.deposit(amount); //deposite into saving account

		//print new balances
		System.out.println(checkingAccount.getAccountInfo());
		System.out.println(savingsAccount.getAccountInfo());

		//withdrawls

		//from checking
		System.out.println();
		System.out.println("Amount (decimal) to withdraw into your checking account?");
		amount  = scanner.nextDouble(); // get next token 

		try {
			checkingAccount.withdraw(amount); // withdraw from checking account
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();

			System.out.println(e.getMessage());
		} // withdraw from checking

		//from saving
		System.out.println();
		System.out.println("Amount (decimal) to withdraw into your savings account?");
		amount  = scanner.nextDouble(); // get next token 

		try {
			savingsAccount.withdraw(amount); // withdraw from savings account
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();

			System.out.println(e.getMessage());
		} 

		//print the balances
		System.out.println(checkingAccount.getAccountInfo());
		System.out.println(savingsAccount.getAccountInfo());

		scanner.close();

	}

}
