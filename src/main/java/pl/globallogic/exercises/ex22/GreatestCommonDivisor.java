package pl.globallogic.exercises.ex22;

import java.util.ArrayList;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(25, 15));
        System.out.println(getGreatestCommonDivisor(12, 30));
        System.out.println(getGreatestCommonDivisor(9, 18));
        System.out.println(getGreatestCommonDivisor(81, 153));
    }

    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) return -1;

        ArrayList<Integer> firstNumberDivisors = new ArrayList<>();
        ArrayList<Integer> secondNumberDivisors = new ArrayList<>();

        for (int i = 1; i <= first; i++) {
            if (first % i == 0) firstNumberDivisors.add(i);
        }

        for (int j = 1; j <= second; j++) {
            if (second % j == 0) secondNumberDivisors.add(j);
        }

        int temp = 0;
        int greatestCommonDivisor = 0;

        for (int k = 0; k < firstNumberDivisors.size(); k++) {
            for (int l=0; l < secondNumberDivisors.size(); l++) {
                if (temp == secondNumberDivisors.get(l)) greatestCommonDivisor = secondNumberDivisors.get(l);
            }
            temp = firstNumberDivisors.get(k);
        }

        return greatestCommonDivisor;
    }
}
