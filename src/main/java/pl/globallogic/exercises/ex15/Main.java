package pl.globallogic.exercises.ex15;

public class Main {
    public static void main(String[] args) {
        System.out.println(sumOdd(1, 100));
        System.out.println(sumOdd(-1, 100));
        System.out.println(sumOdd(100, 100));
        System.out.println(sumOdd(13, 13));
        System.out.println(sumOdd(100, -100));
        System.out.println(sumOdd(100, 1000));
    }

    public static boolean isOdd(int number) {
        if (number < 0) return false;
        if (number%2 == 1) return true;
        return false;
    }

    public static int sumOdd(int start, int end) {
        if (start < 0 || end < 0 ) return -1;
        if (start > end) return -1;

        int sum = 0;

        for (int i = start; i <= end; i++) {
            if (isOdd(i)) {
                sum = sum + i;
            }
        }
        return sum;
    }

}


// odd = 1, 3, 5
// even 2, 4, 6