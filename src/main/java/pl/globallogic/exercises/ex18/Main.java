package pl.globallogic.exercises.ex18;

public class Main {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(252));
        System.out.println(getEvenDigitSum(-22));

    }

    public static int getEvenDigitSum(int number) {
        if (number < 0) return -1;

        String num = String.valueOf(number);
        int digit = 0;
        int sum = 0;

        for (int i=0; i < num.length(); i++ ) {
            digit = Integer.valueOf(num.substring(i, i+1));
            if (isEven(digit)) sum = sum + digit;
        }
        return sum;
    }

    public static boolean isEven(int number) {
        if (number < 0) return false;
        if (number%2 == 0) return true;
        return false;
    }
}
