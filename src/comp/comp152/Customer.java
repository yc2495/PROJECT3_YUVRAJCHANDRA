package comp.comp152;

import java.util.ArrayList;

/**
 * Class Customer
 */
public abstract class Customer {

    // Fields
    public static ArrayList<ShippingAddress> Addresses;
    public static String Name;
    private int customerID;
    private static int nextID = 5000; //all preloaded customers from the text file must have IDs lower than 5000

    // Constructors
    // @param Name, Id
    public Customer (String custName, int ID) {
        this.Name = custName;
        this.customerID = ID;
        this.Addresses = new ArrayList<ShippingAddress>();
    }

    // @param custName
    public Customer(String custName)
    {
        Name = custName;
        nextID++;
        customerID = nextID;
        Addresses = new ArrayList<ShippingAddress>();
    }

    // Methods
    public ArrayList<ShippingAddress> getAddresses () {
        //this returns a copy of the list so that the caller cannot change the private instance variable
        return new ArrayList<ShippingAddress>(Addresses);
    }

    public String getName () {
        return Name;
    }

    public int getCustomerID () {
        return customerID;
    }

    public void addAddress(ShippingAddress newAddress)
    {
        Addresses.add(newAddress);
    }

    @Override
    public String toString() {
        return "Customer Name: " + Name +"\nCustomerID: "+customerID + "\nWith "+Addresses.size() + " addresses on file";
    }

    public void arrangeDelivery() {
        System.out.println(Name + "deliver any time");
    }

    public double payOutstandingBalance() {
        return 0.0;
    }

    public abstract double PayForOrder();
}

