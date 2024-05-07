package pl.globallogic.exercises.ex10;

public class MinutesToYearsAndDaysCalculator {
    public static void main(String[] args) {
        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
    }

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
            return;
        }

        int MINUTES_IN_YEAR = 60 * 24 * 365; // if it's not leap year
        int MINUTES_IN_DAY = 60 * 24;

        System.out.println(minutes + " min = " + minutes / MINUTES_IN_YEAR + " y and " + (minutes%MINUTES_IN_YEAR) / MINUTES_IN_DAY + " d");
    }
}
