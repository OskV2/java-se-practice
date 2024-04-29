package pl.globallogic.exercises.ex21;

public class Main {
    public static void main(String[] args) {
        printFactors(6);
        printFactors(32);
        printFactors(10);
        printFactors(-1);
    }

    public static void printFactors(int number) {
        if (number < 1) {
            System.out.println("Invalid value");
            return;
        }

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) System.out.printf(i + " ");
        }
        System.out.println();
    }
}
