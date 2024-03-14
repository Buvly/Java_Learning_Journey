public class isEvenChallenge {
    public static void main(String[] args) {
        int i = 5;
        int count = 0;
        while (i <= 20) {
            if (isEven(i)) {
                System.out.println("" + i + "is an even number");
                count++;
            }
            i++;
            if (count == 5) {
                break;
            }
        }
    }

    private static boolean isEven(int num) {
        if (num % 2 == 0) {
            return true;
        }
        return false;
    }
}
