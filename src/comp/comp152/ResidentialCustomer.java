package comp.comp152;

import java.util.ArrayList;

/**
 * Class ResidentialCustomer
 */
public class ResidentialCustomer extends Customer {

    // Constructor
    public ResidentialCustomer(String customerName) {
        super(customerName);
    }

    // Methods
    public double PayForOrder(ArrayList<merchandiseItem> order) {
        System.out.println("This order is for " + getName() + " and will be paid for with a purchase order");
        double sum = 0;
        double tax = 0;
        for (var item : order) {
            switch(item.getType()) {
                case GeneralMerchandise -> {
                    tax = 1.0625;
                    sum += (item.getPrice() * tax);
                }
                case WICFood -> {
                    sum += item.getPrice();
                }
                case Clothing -> {
                    if (item.getPrice() <= 175) {
                        sum += item.getPrice();
                    } else {
                        tax = 0.0625 * (item.getPrice) - 175);
                    }
                }
            }
        }
        purchaseOrderBalance += sum;
        return 0;
    }


}
