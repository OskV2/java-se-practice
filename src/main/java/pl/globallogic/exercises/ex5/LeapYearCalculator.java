package pl.globallogic.exercises.ex5;

public class LeapYearCalculator {
    public static void main(String[] args) {
        System.out.println(isLeapYear(-1600));
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(2017));
        System.out.println(isLeapYear(2000));
        System.out.println(isLeapYear(2016));
    }

    public static boolean isLeapYear(int year) {
        if (year < 0 || year > 9999) return false; // range

        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
