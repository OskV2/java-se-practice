package pl.globallogic.exercises.ex17;

public class Main {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(252));
        System.out.println(sumFirstAndLastDigit(257));
        System.out.println(sumFirstAndLastDigit(0));
        System.out.println(sumFirstAndLastDigit(5));
        System.out.println(sumFirstAndLastDigit(-10));
    }

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) return -1;

        int firstDigit = number;
        int lastDigit = 0;

        while (firstDigit >= 10) {
            firstDigit = firstDigit / 10;
        }
        lastDigit = number % 10;

        return firstDigit + lastDigit;
    }
}
