package pl.globallogic.sessions.s7.challanges;

public class PatternChecker {

    //  For string contains () and [] define if it is correctly formed
    //  each open brace has its closed counterpart

    public static void main(String[] args) {
        System.out.println(patternChecker("function name(parameter1, parameter2, parameter3)"));
        System.out.println(patternChecker("def my_function():print(Hello from a function)"));
        System.out.println(patternChecker("const cars = [\"Saab\", \"Volvo\", \"BMW\"];"));
    }

    public static boolean patternChecker(String text) {
        char openingRound = '(';
        char closingRound = '(';
        int roundOpeningNumber = 0;
        int roundClosingNumber = 0;

        char openingSquare = '[';
        char closingSquare = ']';
        int squareOpeningNumber = 0;
        int squareClosingNumber = 0;


        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == openingRound) roundOpeningNumber++;
            if (text.charAt(i) == closingRound) roundClosingNumber++;
            if (text.charAt(i) == openingSquare) squareOpeningNumber++;
            if (text.charAt(i) == closingSquare) squareClosingNumber++;
        }

        return (roundOpeningNumber == roundClosingNumber) && (squareOpeningNumber == squareClosingNumber);
    }
}
