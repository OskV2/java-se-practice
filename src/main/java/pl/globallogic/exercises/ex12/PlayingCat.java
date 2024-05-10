package pl.globallogic.exercises.ex12;

public class PlayingCat {
    public static void main(String[] args) {
        System.out.println(isCatPlaying(true, 10));
        System.out.println(isCatPlaying(false, 36));
        System.out.println(isCatPlaying(false, 35));
    }

    public static boolean isCatPlaying(boolean summer, int temperature) {
        if (temperature < 24) return false;
        if (summer) {
            if (temperature < 46) return true;
        }
        if (temperature < 36) return true;
        return false;
    }
}
