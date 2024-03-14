public class Customer {
    private String name;
    private float creditLimit;
    private String emailAddress;

    public Customer(String name, float creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }
    public Customer() {
        this("Buvly", 1000, "Buvly@gmail.com");
    }

    public Customer(String name, String emailAddress) {
        this(name, 9999, emailAddress);
    }

    public String getName() {
        return name;
    }

    public float getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
