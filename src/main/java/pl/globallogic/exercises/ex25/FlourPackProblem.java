package pl.globallogic.exercises.ex25;

public class FlourPackProblem {
    public static void main(String[] args) {
        System.out.println(canPack(1, 0 ,4));
        System.out.println(canPack(1, 0 ,5));
        System.out.println(canPack(0, 5, 4));
        System.out.println(canPack(2, 2, 11));
        System.out.println(canPack(-3, 2, 12));
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        int bigCountKilos = 5;
        int smallCountKilos = 1;
        int packageWeight = 0;

        if (bigCount < 0 || smallCount < 0 || goal < 0) return false;

        for (int i = 0; i <= bigCount; i++)  {
            packageWeight = i * bigCountKilos;
            if (packageWeight == goal) return true;
            if (packageWeight > goal) {
                packageWeight = packageWeight - bigCountKilos;
                break;
            }
        }

        for (int j = 0; j < smallCount; j++) {
            packageWeight = packageWeight + smallCountKilos;
            if (packageWeight == goal) return true;
        }

        return false;
    }
}
