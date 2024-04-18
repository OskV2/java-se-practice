package pl.globallogic.sessions.s2.challanges;

import java.util.Scanner;

public class PowerOfNumberCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Write number: ");
        int number = scan.nextInt();
        System.out.println("Write degree: ");
        int degree = scan.nextInt();
        System.out.println("Number" + number + " in " + degree + " is equal to " + calculate(number, degree));
    }

    private static long calculate(int number, int degree) {
        int result = 1;
        while (degree > 0) {
            result = result * number;
            degree = degree - 1;
        }
        return result;
    }
}
