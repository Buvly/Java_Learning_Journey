public class OperatorChallenge {
    public static void main(String[] args) {
        double dValue1 = 20.00d;
        double dValue2 = 80.00d;

        double operation1 = (dValue1 + dValue2) * 100.00d;
        System.out.println("Adding the 2 values and mul by 100 = " + operation1);

        double operation2 = operation1 % 40.00d;
        System.out.println("Getting the result modulus 40 = " + operation2);

        boolean remainderIsZero = (operation2 == 0) ? true : false;
        System.out.println("Checking if remainder is zero: " + remainderIsZero);

        if (remainderIsZero != true) {
            System.out.println("got some remainder");
        }
    }
}
