public class NumberPalindrome {
    // write code here
    public static boolean isPalindrome(int number) {
        int lastDigit = 0;
        int reverse = 0;
        int original = number;
        while (original != 0) {
            lastDigit = original % 10;
            reverse *= 10;
            reverse += lastDigit;
            original /= 10;
        }

        if (number == reverse) {
            return true;
        } else {
            return false;
        }
    }
}