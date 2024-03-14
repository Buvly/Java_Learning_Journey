public class FirstLastDigitSum {
    // write code here
    public static int sumFirstAndLastDigit(int number) {
        int last = number % 10;

        if (number < 0) {
            return -1;
        } else {
            while (number >= 10) {
                number /= 10;
            }
            return number + last;
        }
    }
}
