public class sumDigits {
    public static void main(String[] args) {
        System.out.println("Sum of digits of 1234 = " + sumDigits(1234));
        System.out.println("Sum of digits of -125 = " + sumDigits(-125));
        System.out.println("Sum of digits of 5 = " + sumDigits(5));
        System.out.println("Sum of digits of 32123 = " + sumDigits(32123));
    }

    public static int sumDigits(int number) {
        int sum = 0;
        if (number < 0) {
            return -1;
        } else {
            while (number != 0) {
                sum += number % 10;
                number /= 10;
            }
            return sum;
        }
    }
}
