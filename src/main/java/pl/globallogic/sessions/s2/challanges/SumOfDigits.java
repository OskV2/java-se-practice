package pl.globallogic.sessions.s2.challanges;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Sum of dits. Please write number: ");
        long number = scan.nextLong();
        System.out.println("Result: " + calculate(number));
    }

    private static long calculate(long targetNumber) {
        long sumOfDigits = 0L;
        long remainder = targetNumber;
        while (remainder != 0) {
            sumOfDigits += remainder % 10;
            remainder = remainder / 10;
        }
        return Math.abs(sumOfDigits);
    }
}
