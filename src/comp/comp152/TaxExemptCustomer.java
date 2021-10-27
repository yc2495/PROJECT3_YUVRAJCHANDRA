package comp.comp152;

import java.util.ArrayList;

/**
 * Class TaxExemptCustomer
 */
public class TaxExemptCustomer extends Customer {

    // Constructor
    public TaxExemptCustomer(String customerName) {
        super(customerName);
    }

    // Methods
    public void arrangeDelivery() {
        print("Please contact " + getName() + " on the day of delivery");
    }

    public double PayForOrder(ArrayList<merchandiseItem> order) {
        print("This order is for " + getName() + " and will be paid for with a purchase order");
        double sum = 0;
        for (var item : order) {
            sum += item.getPrice();
        }
        return sum;
    }
}
