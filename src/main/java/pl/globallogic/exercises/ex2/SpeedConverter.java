package pl.globallogic.exercises.ex2;

public class SpeedConverter {
    public static void main(String[] args) {
        System.out.println(toMilesPerHour(1.5));
        System.out.println(toMilesPerHour(10.25));
        System.out.println(toMilesPerHour(-5.6));
        System.out.println(toMilesPerHour(25.42));
        System.out.println(toMilesPerHour(75.114));

        printConversion(1.5);
        printConversion(10.25);
        printConversion(-5.6);
        printConversion(25.42);
        printConversion(75.114);
    }

    public static long toMilesPerHour(double kilometersPerHour) {
        double DIVIDER = 1.609;
        if (!(kilometersPerHour >= 0)) return -1;
        return Math.round(kilometersPerHour / DIVIDER);
    }

    public static void printConversion(double kilometersPerHour) {
        long result = toMilesPerHour(kilometersPerHour);
        if (result == -1) {
            System.out.println("Invalid input");
            return;
        }
        System.out.println(kilometersPerHour + " km/h = " + result + " mph");
    }
}
