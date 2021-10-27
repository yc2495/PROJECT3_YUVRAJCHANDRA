package comp.comp152;

import java.util.ArrayList;

/**
 * Class BusinessCustomer
 */
public class BusinessCustomer extends Customer {

    private double purchaseOrderBalance;

    // Constructors
    public BusinessCustomer(String customerName) {
        super(customerName);
    }

    // Methods
    @Override
    public double PayForOrder(ArrayList<merchandiseItem> order) {
        System.out.print("This order is for " + getName() + " and will be paid for with a purchase order");
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
                        tax = 0.0625 * (item.getPrice - 175);
                    }
                }
            }
        }
        purchaseOrderBalance += sum;
        return 0;
    }

    public void arrangeDelivery() {

        System.out.println(getName() + ",  all deliveries must be from 9-5 Mon-Fri");
    }

    public double payOutstandingBalance() {
        total = purchaseOrderBalance;
        if (total > 1000) {
            total = (total * 0.95);
        }
        purchaseOrderBalance = 0;
        return total;
    }
}
