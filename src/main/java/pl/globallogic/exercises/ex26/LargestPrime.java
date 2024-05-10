package pl.globallogic.exercises.ex26;

import java.util.ArrayList;

public class LargestPrime {
    public static void main(String[] args) {
        System.out.println(getLargestPrime(21));
        System.out.println(getLargestPrime(217));
        System.out.println(getLargestPrime(0));
        System.out.println(getLargestPrime(45));
        System.out.println(getLargestPrime(-1));

//        System.out.println(getLargestPrime(150));
//        System.out.println(getLargestPrime(187));
//        System.out.println(getLargestPrime(190));
//        System.out.println(getLargestPrime(246));
//        System.out.println(getLargestPrime(330));
    }

    public static int getLargestPrime(int number) {
        if (number <= 0) return -1;

        int largestPrime = 0;
        int temp = 0;
        ArrayList<Integer> divisors = new ArrayList<>();

        for (int i = 2; i <= number - 1; i++) {
            if (number % i == 0) divisors.add(i);
        }

        for (int j = 0; j < divisors.size(); j++) {
            temp = divisors.get(j);
            for (int k = 2; k < temp; k++) {
                if (temp % k == 0) {
                    divisors.remove(j);
                    j--;
                    break;
                }
            }
        }

//        System.out.println(divisors);
        return divisors.get(divisors.size() - 1);
    }
}
