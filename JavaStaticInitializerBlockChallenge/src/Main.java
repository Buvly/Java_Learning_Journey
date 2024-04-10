import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int firstNum = scanner.nextInt();
        int secondNum = scanner.nextInt();

        try
        {
            if (firstNum <= 0 || secondNum <= 0) {
                throw new Exception("Breadth and height must be positive");
            } else {
                System.out.println(firstNum * secondNum);
            }
        } catch (Exception e) {
            System.out.println("java.lang.Exception: " + e.getMessage());
        }

    }
}
