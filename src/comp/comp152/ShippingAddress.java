package comp.comp152;

import java.util.ArrayList;

/**
 * Class Customer
 */
public class ShippingAddress {

    //
    // Fields
    //
    public String AddressLine1;
    public String AddressLine2;
    public String City;
    public String State;
    public String PostalCode;


    //
    // Constructors
    //
    public ShippingAddress(String line1, String line2, String cityName, String stateName, String zipCode) {
        AddressLine1 = line1;
        AddressLine2 = line2;
        City = cityName;
        State = stateName;
        PostalCode = zipCode;
    }


    //
    // Methods
    //
    public String toString (ShippingAddress address) {
        // returns address in a string
        return address.AddressLine1 + "\n" + address.AddressLine2 + "\n" + address.City + "\n" + address.State + "\n" + address.PostalCode;
    }


}

