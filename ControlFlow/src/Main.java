public class Main {
    public static void main(String[] args) {
        char ch = 'A';
        natoPhonetic(ch);
        ch = 'B';
        natoPhonetic(ch);
        ch = 'C';
        natoPhonetic(ch);
        ch = 'D';
        natoPhonetic(ch);
        ch = 'E';
        natoPhonetic(ch);
        ch = 'x';
        natoPhonetic(ch);
        int day = 0;
        System.out.println("Day 0 is: " + printDayOfWeek(day));
        day = 1;
        System.out.println("Day 1 is: " + printDayOfWeek(day));
        day = 2;
        System.out.println("Day 2 is: " + printDayOfWeek(day));
        day = 3;
        System.out.println("Day 3 is: " + printDayOfWeek(day));
        day = 4;
        System.out.println("Day 4 is: " + printDayOfWeek(day));
        day = 5;
        System.out.println("Day 5 is: " + printDayOfWeek(day));
        day = 6;
        System.out.println("Day 6 is: " + printDayOfWeek(day));
        day = 7;
        System.out.println("Day 7 is: " + printDayOfWeek(day));
    }

    private static String printDayOfWeek(int day) {
        return switch (day) {
            case 0 -> "Sunday";
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "Invalid";
        };
    }

    public static void natoPhonetic(char c) {
        switch (c) {
            case 'A':
                System.out.println("A is Able");
                break;
            case 'B':
                System.out.println("B is Baker");
                break;
            case 'C':
                System.out.println("C is Charlie");
                break;
            case 'D':
                System.out.println("D is Dog");
                break;
            case 'E':
                System.out.println("E is Easy");
                break;
            default:
                System.out.println("Invalid");
        }
    }
}
