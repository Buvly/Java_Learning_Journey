public class GreatestCommonDivisor {
    // write code here
    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        } else {
            int commonDivisor = 0;
            if (first > second) {
                for (int i = 1; i <= first; i++) {
                    if (first % i == 0 && second % i == 0) {
                        commonDivisor = i;
                    }
                }
                return commonDivisor;
            } else {
                for (int i = 1; i <= second; i++) {
                    if (first % i == 0 && second % i == 0) {
                        commonDivisor = i;
                    }
                }
                return commonDivisor;
            }
        }
    }
}