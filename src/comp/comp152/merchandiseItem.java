package comp.comp152;

/**
 * Class MerchandiseItem
 */
public class merchandiseItem {

    // enum ItemType Class
    enum ItemType {
        Clothing,
        WICFood,
        GeneralMerchandise
    }

    // Fields
    private ItemType taxibleType;
    private String Name;
    private double price;

    // Constructors
    public merchandiseItem(String name, double price, ItemType type) {
        taxibleType = type;
        Name = name;
        price = price;
    }

    // Methods
    public String getName() {
        return Name;
    }

    public double getPrice() {
        return price;
    }

    public ItemType getType() {
        return taxibleType;
    }

    public String toString (ShippingAddress address) {
        // returns address in a string
        return address.AddressLine1 + "\n" + address.AddressLine2 + "\n" + address.City + "\n" + address.State + "\n" + address.PostalCode;
    }
}

