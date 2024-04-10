public class Burger {
    private String burgerType;
    private double burgerPrice;

    public Burger() {
        this.burgerType = "Hamburger";
        this.burgerPrice = 25.00;
    }

    public Burger(String burgerType) {
        this.burgerType = burgerType;
        if (burgerType == "Hamburger") {
            this.burgerPrice = 25.00;
        } else if (burgerType == "Beefburger") {
            this.burgerPrice = 30.00;
        } else if (burgerType == "Chickenburger") {
            this.burgerPrice = 17.00;
        } else {
            System.out.println("Invalid Burger Type");
            this.burgerPrice = 0.00;
        }
    }

    public String addTopping(String topping1) {

        switch (topping1.toUpperCase().charAt(0)) {
            case 'B' -> this.burgerPrice += 10;  // B for 1 slice of Burger 10$
            case 'S' -> this.burgerPrice += 5;   // S for 1 sauce 5$
            case 'O' -> this.burgerPrice += 3;   // O for Onions  3$
            default -> System.out.println("Invalid topping");
        }
        return String.format("You added %s", topping1);
    }

    public String addToppings(String topping1, String topping2) {
        this.addTopping(topping1);
        this.addTopping(topping2);

        return String.format("You added %s and %s", topping1, topping2);
    }

    public String addToppings(String topping1, String topping2, String topping3) {
        this.addToppings(topping1, topping2);
        this.addTopping(topping3);

        return String.format("You added %s, %s, and %s", topping1, topping2, topping3);
    }

    public double getBurgerPrice() {
        return this.burgerPrice;
    }

    public String getBurgerType() {
        return this.burgerType;
    }

}
