package pl.globallogic.exercises.ex3;

public class MegaBytesConverter {
    public static void main(String[] args) {
        printMegaBytesAndKiloByes(2500);
        printMegaBytesAndKiloByes(-1);
        printMegaBytesAndKiloByes(5000);
    }

    public static void printMegaBytesAndKiloByes(int kiloBytes) {
        int CONST = 1024;
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
            return;
        }

        System.out.printf("%d KB = %d MB and %d KB. \n", kiloBytes, (kiloBytes / CONST), (kiloBytes % CONST));
    }
}
