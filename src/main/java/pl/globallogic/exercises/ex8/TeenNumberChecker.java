package pl.globallogic.exercises.ex8;

public class TeenNumberChecker {
    public static void main(String[] args) {
        System.out.println(hasTeen(9, 99, 19));
        System.out.println(hasTeen(23, 15, 42));
        System.out.println(hasTeen(22, 23, 34));

        System.out.println(isTeen(9));
        System.out.println(isTeen(13));
    }

    public static boolean hasTeen(int a, int b, int c) {
        if ((12 < a && a < 20) || (12 < b && b < 20) || (12 < c && c < 20)) {
            return true;
        }
        return false;
    }

    public static boolean isTeen (int a) {
        if (12 < a && a < 20) {
            return true;
        }
        return false;
    }
}
