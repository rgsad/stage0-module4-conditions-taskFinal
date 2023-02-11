package school.mjc.stage0.conditions.finalTask;

public class DaysInMonth {
    public void printDays(int year, int month) {
        boolean leap = year % 4 == 0 && year % 100 != 0 || year % 100 == 0 && year % 400 == 0;
        if (year < 0 || month < 0 || month > 12) {
            System.out.println("invalid date");
        } else if (leap && month == 2) {
            System.out.println(29);
        } else {
            switch (month) {
                case 2 -> System.out.println(28);
                case 4, 6, 9, 11 -> System.out.println(30);
                default -> System.out.println(31);
            }
        }

    }
}
