package pl.globallogic.exercises.ex24;

import java.util.ArrayList;

public class NumberToWords {
    public static void main(String[] args) {
        System.out.println("Number to words:");
        numberToWords(123);
        numberToWords(1010);
        numberToWords(1000);
        numberToWords(-12);
        System.out.println();

        System.out.println("Reverse:");
        System.out.println(reverse(-121));
        System.out.println(reverse(2121));
        System.out.println(reverse(1234));
        System.out.println(reverse(100));
        System.out.println();

        System.out.println("Get digit count: ");
        System.out.println(getDigitCount(0));
        System.out.println(getDigitCount(123));
        System.out.println(getDigitCount(-12));
        System.out.println(getDigitCount(5200));
    }

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid value");
            return;
        }

        int stringLength = getDigitCount(number);
        int divider = 10;
        ArrayList<Integer> digits = new ArrayList<>();

        number = reverse(number);

        for (int i = 0; i < stringLength; i++) {
            digits.add(number % divider);
            number = number / 10;
            int digit = digits.get(i);

            switch (digit) {
                case 0:
                    System.out.printf("Zero ");
                    break;
                case 1:
                    System.out.printf("One ");
                    break;
                case 2:
                    System.out.printf("Two ");
                    break;
                case 3:
                    System.out.printf("Three ");
                    break;
                case 4:
                    System.out.printf("Four ");
                    break;
                case 5:
                    System.out.printf("Five ");
                    break;
                case 6:
                    System.out.printf("Six ");
                    break;
                case 7:
                    System.out.printf("Seven ");
                    break;
                case 8:
                    System.out.printf("Eight ");
                    break;
                case 9:
                    System.out.printf("Nine ");
                    break;
            }
        }
        System.out.println();
    }

    public static int reverse(int number) {
        String numberString = String.valueOf(number);
        int stringLength = number > 0 ? numberString.length() : numberString.length() - 1;
        int reversedNumber = 0;
        int temp = 0;

        for (int i = 0; i < stringLength; i++) {
             temp = number % 10;
             reversedNumber = reversedNumber * 10 + temp;
             number = number / 10;
        }

        return reversedNumber;
    }

    public static int getDigitCount(int number) {
        if (number < 0) return -1;
        return String.valueOf(number).length();
    }
}
