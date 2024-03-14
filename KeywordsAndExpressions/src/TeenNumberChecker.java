public class TeenNumberChecker {
    // write code here
    public static boolean hasTeen(int num1, int num2, int num3) {
        if ((num1 >= 13 && num1 <= 19) || (num2 >= 13 && num2 <= 19) || (num3 >= 13 && num3 <= 19)) {
            return true;
        }
        return false;
    }

    public static boolean isTeen(int par) {
        if (par >= 13 && par <= 19) {
            return true;
        }
        return false;
    }
}