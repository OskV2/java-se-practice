package pl.globallogic.sessions.s2;

public class Puzzler {
    public static void main(String[] args) {
        // --------------------
        // Example 1
        // --------------------

        int a = 100;
        int b = 100;
        if (++b > a || b++ == a) {
            a++;
        }

        a = (a++ > b && ++b < a++ ? ++a : ++b );
        System.out.println("\u26A0 Already wrote: " + a + " code lines, but need to write: " + b + " more.");
    }
}
