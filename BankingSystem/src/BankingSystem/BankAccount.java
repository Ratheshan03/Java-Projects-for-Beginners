package BankingSystem;

/**
 * Represents a checking/saving bank account for a customer
 */
public class BankAccount {
    // instance variables

    /**
     * Type of account checking/saving
     */
    String accountType;

    /**
     * Balance for bank account
     */
    double balance;

    /**
     * Customer for this account
     */
    Customer customer;


    /**
     * Creates a bank account of given types for given customer
     * @param accountType for bank account
     * @param customer for bank account
     */
    public BankAccount(String accountType, Customer customer){
        this.accountType = accountType;
        this.customer = customer;
    }

    //methods

    /**
     * Deposites the given amount
     * @param amount to add to balance
     */
    public void deposit(double amount) {
        this.balance += amount;
        
    }

    /**
     * Withdraws the given amount from balance
     * @param amount to withdraw
     * @throws Exception if given amount is greater than balance
     */
    public void withdraw(double amount) throws Exception{
        if (amount > this.balance){
            throw new Exception("Amount is greater than availbale balance.");
        }
        this.balance -= amount;
    }

    /**
     * Returns account type and blance for this bank account
     * @return string with all the info
     */
    public String getAccountInfo(){
        return this.accountType + ": " + this.balance;
    }

    /**
     * Returns the customer name and address for this bank account.
     * @return string with all the info
     */
    public String getCustomerInfo(){
        return this.customer.getName() + " from " + this.customer.getAddress();
    }


}
