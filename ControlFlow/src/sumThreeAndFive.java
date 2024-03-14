public class sumThreeAndFive {
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;
        for (int i = 1; i <= 1000 && count < 5; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("Found a match: " + i);
                sum += i;
                count++;
            }
            else
                continue;
        }
        System.out.println("Sum of numbers = " + sum);
    }
}
