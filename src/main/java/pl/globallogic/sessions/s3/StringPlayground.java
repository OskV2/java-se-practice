package pl.globallogic.sessions.s3;

public class StringPlayground {
    public static void main(String[] args) {
        String name1 = "Osk";
        System.out.println(name1.toUpperCase());

        String fruit = "APPLE";
        System.out.println(fruit.toLowerCase());

        String text = "I like Java coding";
        System.out.println(text.indexOf("a"));
        System.out.println(text.substring(12));
        System.out.println(text.substring(7,12));
        System.out.println(text.startsWith("I like"));
        System.out.println(text.endsWith("ing"));
        System.out.println(text.replace("i", "I"));
        System.out.println(text.split(" ")[1]);

        String fruit1 = "orange";
        String fruit2 = "banana";
        System.out.println(fruit1.compareTo(fruit2));
    }
}
