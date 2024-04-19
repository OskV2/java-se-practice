package pl.globallogic.sessions.s5.challanges;

import java.util.Scanner;

public class VowelConsonantCounter {

    //  Count vowels and consonants in the String
    //  Vowel - a, i, y, o, u, e.  Consonants - other

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your word");
        String word = scan.next();
        int[] counts = countVowelsConsonants(word);
        System.out.printf("There are %d consonants and %d vowels in '%s'. \n", counts[0], counts[1], word);
    }

    private static int[] countVowelsConsonants(String word) {
        int vowels = 0;
        int consonants = 0;

        for (int i=0; i<word.length(); i++) {
            char c = Character.toLowerCase(word.charAt(i));
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'y') {
                vowels++;
            } else {
                consonants++;
            }
        }

        return new int[]{consonants, vowels};
    }
}
