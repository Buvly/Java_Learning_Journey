public class MinutesToYearsDaysCalculator {
    // write code here
    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {System.out.println("Invalid Value");}
        else {
            long days = minutes / 1440;
            int YY = (int) days / 365;
            int ZZ = (int) days - (YY * 365);
            System.out.println("" + minutes + " min = " + YY + " y and " + ZZ + " d");
        }
    }
}