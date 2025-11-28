package domain;

//EN: Represents a VIP customer with special discounts and membership level.

public class VipCustomer extends Customer {

    // Ensures compatibility during serialization.

    private static final long serialVersionUID = 1L;

    // ATTRIBUTES

    private double discount; // Discount percentage
    private String vipLevel; // VIP membership level

    // CONSTRUCTORS

    // EN: Creates a VIP customer with a specified discount and level.

    public VipCustomer(int id, String name, String email,
            double discount, String vipLevel) {
        super(id, name, email); // Calls Customer constructor
        this.discount = discount;
        this.vipLevel = vipLevel;
    }

    // Creates a VIP customer with default discount and level.

    public VipCustomer(int id, String name, String email) {
        super(id, name, email);
        this.discount = 0.10; // Default discount
        this.vipLevel = "GOLD"; // Default level
    }

    // BUSINESS LOGIC

    // EN: Computes the price applying the VIP discount.

    @Override
    public double computePrice(Event event) {
        return event.getTicketPrice() * (1 - discount);
    }

    // GETTERS

    public double getDiscount() {
        return discount;
    }

    public String getVipLevel() {
        return vipLevel;
    }
}
