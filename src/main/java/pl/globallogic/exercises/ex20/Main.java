package pl.globallogic.exercises.ex20;

public class Main {
    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(41, 22, 71));
        System.out.println(hasSameLastDigit(23, 32, 42));
        System.out.println(hasSameLastDigit(9 ,99 ,999));
    }

    public static boolean hasSameLastDigit(int a, int b, int c) {
        if (!isValid(a) || !isValid(b) || !isValid(c)) return false;

        int lastDigitA = a % 10;
        int lastDigitB = b % 10;
        int lastDigitC = c % 10;

        if ( lastDigitA == lastDigitB || lastDigitA == lastDigitC || lastDigitB == lastDigitC) return true;
        return false;
    }

    public static boolean isValid(int a) {
        if (a < 10 || a > 1000) return false;
        return true;
    }
}
