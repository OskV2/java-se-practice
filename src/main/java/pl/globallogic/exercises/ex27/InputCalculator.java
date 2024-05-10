package pl.globallogic.exercises.ex27;

import java.util.ArrayList;
import java.util.Scanner;

public class InputCalculator {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        int sum = 0;
        int avg = 0;

        System.out.println("Enter an integer to calculate. Enter anything else to print.");

        while(scan.hasNextInt()) {
            int number = scan.nextInt();
            numbers.add(number);
            sum = sum + number;
        }
        if (numbers.size() > 0) avg = sum / numbers.size();

        System.out.printf("SUM = " + sum + " AVG = " + avg);
    }
}
