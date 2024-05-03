import java.util.Arrays;

public class ReverseArray {
    // write code here
    private static void reverse(int[] array) {
        int maxIndex = array.length - 1;
        int halfLength = array.length / 2;

        System.out.println("Array = " + Arrays.toString(array));
        for (int i = 0; i < halfLength; i++) {
            int tmp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = tmp;
        }
        System.out.println("Reversed array = " + Arrays.toString(array));
    }
}