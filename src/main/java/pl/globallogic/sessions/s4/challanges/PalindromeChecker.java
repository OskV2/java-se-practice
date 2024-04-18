package pl.globallogic.sessions.s4.challanges;

public class PalindromeChecker {

    // Check if string is a palindrome - abccba

    public static void main(String[] args) {
        String validInput = "abccba";
        String invalidInput = "abcdef";

        System.out.println(isPalindrome(validInput) == true);
        System.out.println(isPalindrome(invalidInput) == true);
    }

    public static boolean isPalindrome(String text) {
        String reversedText = "";
        char character;

        for (int i=0; i<text.length(); i++) {
            character = text.charAt(i);
            reversedText = character + reversedText;
        }

//        System.out.println(text);
//        System.out.println(reversedText);

        return text.equals(reversedText);
    }
}
