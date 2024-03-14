public class SharedDigit {
    public static boolean hasSharedDigit(int num1, int num2) {
        int digit1 = 0;
        int digit2 = 0;

        // Check if numbers are within range
        if ((num1 < 10 || num1 > 99) || (num2 < 10 || num2 > 99)) {
            return false;
        } else {
            // Iterate through each digit of num1
            while (num1 > 0) {
                digit1 = num1 % 10;

                // Reset num2 for each digit of num1
                int tempNum2 = num2;

                // Iterate through each digit of num2
                while (tempNum2 > 0) {
                    digit2 = tempNum2 % 10;

                    // Check if digits match
                    if (digit1 == digit2) {
                        return true;
                    }

                    // Move to the next digit of num2
                    tempNum2 /= 10;
                }

                // Move to the next digit of num1
                num1 /= 10;
            }

            // If no shared digit is found, return false
            return false;
        }
    }
}