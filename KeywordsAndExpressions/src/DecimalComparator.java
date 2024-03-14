public class DecimalComparator {
    // write code here
    public static boolean areEqualByThreeDecimalPlaces(double p1, double p2) {
        int p1Rounded = (int) (p1 * 1000);
        int p2Rounded = (int) (p2 * 1000);
        if (p1Rounded == p2Rounded) {
            return true;
        }
        return false;
    }
}