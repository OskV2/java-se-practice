package pl.globallogic.exercises.ex42;

import java.util.Scanner;

public class MinimumElement {
    public static void main(String[] args) {
        int arraySize = readInteger();
        int[] intArray = readElements(arraySize);
        System.out.println(findMin(intArray));
    }

    public static int readInteger() {
        Scanner arraySizeScanner = new Scanner(System.in);
        System.out.println("How big array do you want?");
        return arraySizeScanner.nextInt();
    }

    public static int[] readElements(int size) {
        int[] integerArray = new int[size];
        int i = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter number: ");

        while(scan.hasNextInt()) {
            integerArray[i] = scan.nextInt();
            i++;
            if (i == size) break;
            System.out.println("Please enter number: ");
        }

        return integerArray;
    }

    public static int findMin(int[] arr) {
        int min = arr[0];
        int arraySize = arr.length;
        
        for (int i = 0; i < arraySize; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        
        return min;
    }
}
