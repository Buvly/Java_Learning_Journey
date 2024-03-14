public class BarkingDog {
    // write code here
    public static boolean shouldWakeUp (boolean barking, int hourOfDay) {
        if (barking && ((hourOfDay >= 0 && hourOfDay < 8) || (hourOfDay > 22 && hourOfDay <24))) {return true;}
        else {return false;}
    }
}