package pl.globallogic.exercises.ex43;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6};
        int[] arr2 = {1, 3, 5, 7, 9, 11, 13, 15};
        int[] arr3 = {-12, -10, -8, -6, -4, -2, 0, 2, 4, 6};

        reverse(arr1);
        reverse(arr2);
        reverse(arr3);
    }

    public static void reverse(int[] arr) {
        int arraySize = arr.length;
        int[] reversedArr = new int[arraySize];
        int temp = arr[0];

        System.out.printf("Reversed array: [");
        for(int i = 0; i < arraySize; i++) {
            temp = arr[arraySize - 1 - i];
            reversedArr[arraySize - 1 - i] = temp;
            System.out.printf("%,d", reversedArr[arraySize - 1 - i]);
            if (i < arraySize - 1) System.out.printf(", ");
        }

        System.out.printf("]");
        System.out.println();
    }
}
