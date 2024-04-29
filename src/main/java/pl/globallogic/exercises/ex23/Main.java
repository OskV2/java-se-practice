package pl.globallogic.exercises.ex23;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(-1));
    }

    public static boolean isPerfectNumber(int number) {
        if (number < 1) return false;

        int sum = 0;
        ArrayList<Integer> divisors = new ArrayList<>();

        for (int i = 1; i <= number - 1; i++) {
            if (number % i == 0) divisors.add(i);
        }

        for(int j = 0; j < divisors.size(); j++) {
            sum = sum + divisors.get(j);
        }

        if(sum == number) return true;
        return false;
    }
}
