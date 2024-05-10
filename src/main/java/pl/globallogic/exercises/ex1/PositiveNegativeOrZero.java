package pl.globallogic.exercises.ex1;

public class PositiveNegativeOrZero {
    public static void main(String[] args) {
        int positive = 2, negative = -2, zero = 0;

        checkNumber(positive);
        checkNumber(negative);
        checkNumber(zero);
    }

    public static void checkNumber(int num) {
        String message;

        if ( num > 0) {
            message = "Positive";
        } else if ( num < 0) {
            message = "Negative";
        } else {
            message = "Zero";
        }

        System.out.println(message);

    }
}
