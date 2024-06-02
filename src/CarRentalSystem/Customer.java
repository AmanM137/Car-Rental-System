package CarRentalSystem;

/* class to handle cumtomer details */
public class Customer {
    private String customerId;
    private String name;

    /* parameterized constructor */
    public Customer(String customerId, String name) {
        this.customerId = customerId;
        this.name = name;
    }

    /* getter methods to ensure encapsulation */
    public String getCustomerId() {
        return customerId;
    }

    public String getName() {
        return name;
    }
}
