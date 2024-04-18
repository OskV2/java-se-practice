package pl.globallogic.sessions.s2.challanges;

import java.util.Scanner;

public class DigitCounter {
    // count digits in the rational number
    // 13343 - 5
    // 123 - 3
    // input - int only
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your rational number");
        int number = scan.nextInt();
        System.out.println("Digit count for " + number + " will be " + count(number));
        System.out.println("Digit count for " + number + " will be " + count2(number));
    }

    static int count(int num) {
         return String.valueOf(num).length();
    }

    static int count2(int num) {
        int length = 0;
        int temp = 1;
        if (num == 0) {
            return 1;
        }
        while (temp <= num) {
            length++;
            // temp = temp * 10;
            temp *= 10;
        }
        return length;
    }
}
