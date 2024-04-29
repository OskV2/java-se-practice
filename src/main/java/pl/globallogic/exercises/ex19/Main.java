package pl.globallogic.exercises.ex19;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(15, 55));

        //  My tests
        System.out.println(hasSharedDigit(16, 61));
    }

    public static boolean hasSharedDigit(int a, int b) {
        if (a < 10 || b < 10 || a > 99 || b > 99 ) return false;
        String A = String.valueOf(a);
        String B = String.valueOf(b);

        char characterB;

        for (int i = 0; i < A.length(); i++) {
            characterB = B.charAt(i);
            if (A.contains(String.valueOf(characterB))) return true;
        }
        return false;
    }
}
