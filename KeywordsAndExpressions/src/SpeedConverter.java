public class SpeedConverter {
    // write code here
    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {return -1;}
        else {
            return Math.round(kilometersPerHour * (1/1.609));
        }
    }

    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        }
        else {
            int milesPerHour = (int) Math.round(kilometersPerHour * (1/1.609));
            System.out.println("" + kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
        }
    }
}
