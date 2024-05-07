package pl.globallogic.exercises.ex16;

public class NumberPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));
    }

    public static boolean isPalindrome(int number) {
        if (number < 0) number = number * -1;

        String num = String.valueOf(number);
        String reversedNum = "";
        char character;

        for (int i=0; i<num.length(); i++) {
            character = num.charAt(i);
            reversedNum = character + reversedNum;
        }

        return num.equals(reversedNum);
    }
}
