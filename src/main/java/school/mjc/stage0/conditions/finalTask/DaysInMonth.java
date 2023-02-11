package school.mjc.stage0.conditions.finalTask;

public class DaysInMonth {
    public void printDays(int year, int month) {
        if (year < 0 || month < 1 || month > 12) {
            System.out.println("invalid date");
        }

        boolean leap = year % 4 == 0 && year % 100 != 0 || year % 100 == 0 && year % 400 == 0;

        if (leap && month  == 2) {
            System.out.println(29);
        }

        switch (month) {
            case 2:
                System.out.println(28);
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println(30);
                break;
            default:
                System.out.println(31);
                break;
        }

    }
}
