package BankingSystem;

/**
 * Represents a customer of a bank
 */
public class Customer {

    //instance variables

    /**
     * Name of the customer
     */
    String name;

    /**
     * Address of customer
     */
    String address;

    //constructor
    /**
     * Creates a customer with the given name.
     * @param name of the customer
     */
    public Customer(String name) {
        //sets instances var name to given name
        this.name = name;
    }

    /**
     * Sets the address of the customer to be given adress
     * @param adresss of the customer
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Returns customer's name
     * @return name for the customer
     */
    public String getName() {
        return this.name;
    }

    /**
     * Returns customer's address
     * @return address for the customer
     */
    public String getAddress() {
        return this.address;
    }

}
