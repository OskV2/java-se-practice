package pl.globallogic.exercises.ex41;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SortedArray {
    public static void main(String[] args) {
        Scanner arraySizeScanner = new Scanner(System.in);
        System.out.println("How big array do you want?");
        int arraySize = arraySizeScanner.nextInt();

        int[] arrayToSort = getIntegers(arraySize);
        int[] sortedArray = sortIntegers(arrayToSort);
        System.out.println("---------------------------------------");
        printArray(sortedArray);
    }

    public static int[] getIntegers(int arraySize) {
        int[] integerArray = new int[arraySize];
        int i = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter number: ");

        while(scan.hasNextInt()) {
            integerArray[i] = scan.nextInt();
            i++;
            if (i == arraySize) break;
            System.out.println("Please enter number: ");
        }

        return integerArray;
    }

    public static int[] sortIntegers(int[] intArray) {
        int arraySize = intArray.length;
        int[] sortedIntArrayDescending = new int[arraySize];
        int temp = 0;

        Arrays.sort(intArray);
        for (int i = 0; i < arraySize; i++ ) {
            temp = intArray[i];
            sortedIntArrayDescending[arraySize - 1 - i] = temp;
        }

        return sortedIntArrayDescending;
    }

    public static void printArray(int[] intArray) {
        int arraySize = intArray.length;
        for (int i = 0; i < arraySize; i++) {
            System.out.println("Element " + i + " contents " + intArray[i]);
        }
    }
}