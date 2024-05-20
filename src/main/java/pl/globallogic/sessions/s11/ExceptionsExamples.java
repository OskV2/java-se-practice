package pl.globallogic.sessions.s11;

public class ExceptionsExamples {
    public static void main(String[] args) {
        methodWithSleep();
    }

    private static void methodWithSleep() {
        try {
            Thread.sleep(1000);
            System.out.println("Text displayed after some time");
        } catch (InterruptedException | RuntimeException e) {
            System.out.println("We were interrupted");
        } finally {
            System.out.println("This block will always be executed");
        }
    }
}
