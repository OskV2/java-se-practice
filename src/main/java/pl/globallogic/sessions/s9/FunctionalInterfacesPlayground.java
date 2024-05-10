package pl.globallogic.sessions.s9;

import pl.globallogic.sessions.s8.Dish;
import pl.globallogic.sessions.s8.extractors.DishDataExtractor;
import pl.globallogic.sessions.s8.filtering.DishTester;

import java.util.ArrayList;
import java.util.List;
import java.util.function.*;

public class FunctionalInterfacesPlayground {
    static int caloriesStatic = 300;

    public static void main(String[] args) {

        //  lambda syntax
        DishDataExtractor caloriesExtractorLambda = (Dish dish) -> { return dish.getCalories();};

        //  effectively final variables
        final int targetCalories = 200;
        DishTester caloriesTester = (Dish dish) -> dish.getCalories() > caloriesStatic;
//        targetCalories += 200;
        caloriesStatic += 200;

        Runnable threadWork = () -> System.out.println("Print this phrase");
        threadWork.run();

        //  consumer
        List<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("grape");
        fruits.add("banana");
        fruits.add("ananas");

        Consumer<String> soutConsumer = fruit -> System.out.println(fruit);
        fruits.forEach(fruit -> System.out.println(fruit));

        //  predicate
        Predicate<String> startingFromA = (String fruit) -> fruit.startsWith("a");
        Predicate<String> startingFromB = (String fruit) -> fruit.startsWith("b");
        System.out.println(startingFromA.test("Banana"));
        fruits.removeIf(startingFromA.or(startingFromB));
        fruits.forEach(soutConsumer);

        //  function
        Function<String, Integer> wordToLength = (word) -> word.length();
        System.out.println(wordToLength.apply("Apple"));

        //  supplier
        Supplier<String> getFruit = () -> "Apple";
        Supplier<Integer[]> newArray = () -> new Integer[10];
        Supplier<List<String>> newList = () -> List.of();

        //  unary operator
        UnaryOperator<String> upperCaseFruits = fruit -> fruit.toUpperCase();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("ananas");
        fruits.replaceAll(upperCaseFruits);
        fruits.forEach(soutConsumer);

        //  binary operator
        BinaryOperator<String> concat = (a, b) -> a + " " + b;
        System.out.println(concat.apply("Big", "Apple"));

        //  list examples = removeIf, replaceAll, forEach

    }
}
