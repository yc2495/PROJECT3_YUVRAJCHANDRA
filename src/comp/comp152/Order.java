package comp.comp152;

import java.util.ArrayList;

/**
 * Class Order
 */
public class Order {

    // Fields
    private ShippingAddress destination;
    private Customer orderedBy;
    private ArrayList<merchandiseItem> cartForOrder;

    // @param dest
    // @param cust
    public Order(ShippingAddress dest, Customer cust, ArrayList<merchandiseItem> cart)
    {
        destination = dest;
        orderedBy = cust;
        cartForOrder = cart;
    }

    // Methods
    public String getDestination()
    {
        return destination.toString();
    }

    public String getOrderer()
    {
        return orderedBy.toString();
    }
}

