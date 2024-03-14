public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer();
        System.out.println(customer1.getName());
        System.out.println(customer1.getEmailAddress());
        System.out.println(customer1.getCreditLimit());

        Customer customer2 = new Customer("Hamada", 100, "hamada@gmail.com");
        System.out.println(customer2.getName());
        System.out.println(customer2.getEmailAddress());
        System.out.println(customer2.getCreditLimit());

        Customer customer3 = new Customer("Lol", "Lol@gmail.com");
        System.out.println(customer3.getName());
        System.out.println(customer3.getEmailAddress());
        System.out.println(customer3.getCreditLimit());
    }
}
