public class PerfectNumber {
    // write code here
    public static boolean isPerfectNumber(int number) {
        int result = 0;
        if (number < 1) {
            return false;
        } else {
            for (int i = 1; i < number; i++) {
                if (number % i == 0) {
                    result += i;
                }
            }
            if (result == number) {
                return true;
            }
            return false;
        }
    }
}