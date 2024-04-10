public class Main {
    public static void main(String[] args) {
        Burger burger = new Burger();
        System.out.println("Please pay: " + burger.getBurgerPrice());
        System.out.println("You ordered: " + burger.getBurgerType());
        System.out.println(burger.addTopping("Burger"));
        System.out.println("After Addition Please pay: " + burger.getBurgerPrice());
        System.out.println("#################################################");

        Burger burger1 = new Burger("Beefburger");
        System.out.println("Please pay: " + burger1.getBurgerPrice());
        System.out.println("You ordered: " + burger1.getBurgerType());
        System.out.println(burger1.addToppings("Burger", "Sauce"));
        System.out.println("After Addition Please pay: " + burger1.getBurgerPrice());
        System.out.println("#################################################");

        Burger burger2 = new Burger("Chickenburger");
        System.out.println("Please pay: " + burger2.getBurgerPrice());
        System.out.println("You ordered: " + burger2.getBurgerType());
        System.out.println(burger2.addToppings("Burger", "Sauce", "Onions"));
        System.out.println("After Addition Please pay: " + burger2.getBurgerPrice());
        System.out.println("#################################################");
    }
}
