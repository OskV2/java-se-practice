package pl.globallogic.exercises.ex14;

public class Main {
    public static void main(String[] args) {
        System.out.println(getDaysInMonth(1, 2020));
        System.out.println(getDaysInMonth(2, 2020));
        System.out.println(getDaysInMonth(2, 2018));
        System.out.println(getDaysInMonth(-1, 2020));
        System.out.println(getDaysInMonth(1, -2020));

        System.out.println("My test cases");
        for (int i=1; i < 13; i++) {
            System.out.println(getDaysInMonth(i, 2023));
            if (i == 2) {
                System.out.println(getDaysInMonth(i, 2024));
            }
        }
    }

    public static boolean isLeapYear(int year) {
        if (year < 0 || year > 9999) return false; // range
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static int getDaysInMonth(int month, int year) {
        if (month < 1 || month > 12) return -1;
        if (year < 0 || year > 9999) return -1;
        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12:
                return 31;
            case 2:
                return isLeapYear(year) ? 29 : 28;
            case 4, 6, 9, 11:
                return 30;
        }
        return -1;
    }
}
