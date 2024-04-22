package pl.globallogic.sessions.s6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ListInterfaceDemo {

    //  Basket of fruits where each fruit will have it's correspondent position with a number

    public static void main(String[] args) {
        Collection<String> fruitCollection = List.of("Apple", "Orange", "Lemon");
        List<String> fruits = new ArrayList<>(fruitCollection);
        fruits.add("Ananas");

        System.out.println("Basket size -> " + fruits.size());
        System.out.println("Is our basket empty -> " + fruits.isEmpty());

        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        fruits.addAll(List.of("Lichi", "Grape"));
        System.out.println("Basket size after addition -> " + fruits.size());
        System.out.println("Fruit in basket with number 2 is " + fruits.get(1));

        fruits.remove(3);
        System.out.println("Our basket after removing 4th element: " + fruits);

        fruits.removeAll(List.of("Apple", "Orange"));
        System.out.println("Our basket after removing collection: " + fruits);

        int indexOfLichi = fruits.indexOf("Lichi");
        System.out.println("Place of Lichi in basket -> " + indexOfLichi);

        fruits.set(0, "Lemon");
        Collections.sort(fruits);
        System.out.println(fruits);
    }
}
