import java.util.Arrays;
import java.util.Scanner;

public class MinimumElement {
    // write code here
    private static int readInteger() {
        System.out.println("Enter the number of elements you want to enter: ");
        Scanner scanner = new Scanner(System.in);
        int numElements = scanner.nextInt();
        return numElements;
    }

    private static int[] readElements(int numElements) {
        System.out.println("Enter the elements you want to enter: ");
        Scanner scanner = new Scanner(System.in);
        int [] elements = new int[numElements];
        for (int num = 0; num < numElements; num++) {
            elements[num] = scanner.nextInt();
        }
        return elements;
    }

    private static int findMin(int[] elements) {
        int min = Integer.MAX_VALUE;

        for (int element : elements) {
            if (element < min) {
                min = element;
            }
        }
        return min;
    }
}