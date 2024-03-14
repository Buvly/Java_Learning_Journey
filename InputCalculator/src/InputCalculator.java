import java.util.Scanner;

public class InputCalculator {
    // write code here
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }
    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        long avg = 0;
        int loopCount = 0;

        while (true) {
            String nextEntry = scanner.nextLine();
            try {
                int validNum = Integer.parseInt(nextEntry);
                sum += validNum;
                loopCount++;
                avg = Math.round((double) sum / loopCount);
            } catch (NumberFormatException nfe) {
                break;
            }
        }
        System.out.println("SUM = " + sum + " AVG = " + avg);
        scanner.close();
    }
}