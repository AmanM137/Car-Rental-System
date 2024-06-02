package CarRentalSystem;

/* class to handle rental details */
public class Rental {
    private Car car;
    private Customer customer;
    private int days;

    /* Parameterized constructor */
    public Rental(Car car, Customer customer, int days) {
        this.car = car;
        this.customer = customer;
        this.days = days;
    }

    /* getter methods to ensure encapsulation */
    public Car getCar() {
        return car;
    }

    public Customer getCustomer() {
        return customer;
    }

    public int getDays() {
        return days;
    }
}
