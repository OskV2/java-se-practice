package pl.globallogic.sessions.s10;

import pl.globallogic.sessions.s8.Dish;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class StreamsPipelineExamples {
    public static void main(String[] args) {

        List<Dish> menu = new ArrayList<>(
                List.of(
                        Dish.of("Pasta", 450, 30, false, "pasta", "cheese", "tomato", "olive oil","milk"),
                        Dish.of("Pizza", 600, 20, false, "flower", "cheese", "tomato", "ham", "chili", "milk"),
                        Dish.of("Hot dog", 250, 15, false, "white bread", "sausage", "mustard", "milk"),
                        Dish.of("Ham sandwich", 250, 10, false, "bread", "ham", "sauce", "salad"),
                        Dish.of("Tofu sandwich", 120, 5, true, "tofu"),
                        Dish.of("Vegan biryani", 250, 30, true, "soy", "olive oil", "bread", "salad", "chili"),
                        Dish.of("Pastrami sandwich", 250, 24, false, "bread", "ham", "sauce", "salad"),
                        Dish.of("Kebab", 250, 13, false, "tortilla", "chicken", "sauce", "tomato", "cucumber", "chili"),
                        Dish.of("Sushi", 200, 10, false, "rice", "fish", "algi", "avocado"),
                        Dish.of("Boiled eggs", 130, 10, false, "egg")
                )
        );

        //  Filter
        System.out.println("Get dishes with cooking time greater than 20");
        List<Dish> filterList = menu.stream()
                .filter(dish -> dish.getCookingTime() > 20).toList();
        System.out.println(filterList);
        System.out.println("-----------------------------------------------");

        //  Map
        System.out.println("Get list of calories values");
        List<String> dishNames = menu.stream()
                .map(dish -> dish.getName()).toList();
        System.out.println(dishNames);
        System.out.println("-----------------------------------------------");

        //  Limit & Skip
        //  Sort
        System.out.println("Get dishes sorted by calories");
        List<String> names = menu.stream()
                .sorted(Comparator.comparingInt(Dish::getCalories))
                .map(Dish::getName).toList();
        System.out.println(names);
        System.out.println("Get top-5 of high-calories dishes");
        List<String> top5Calories = menu.stream()
                .sorted(Comparator.comparingInt(Dish::getCalories).reversed())
                .limit(5)
                .map(Dish::getName).toList();
        System.out.println(top5Calories);
        System.out.println("-----------------------------------------------");

        //  Distinct
        System.out.println("Get list of all possible cooking times");
        List<Integer> cookingTimes = menu.stream()
                .map(dish -> dish.getCookingTime()).distinct().toList();
        System.out.println(cookingTimes);
        System.out.println("-----------------------------------------------");

        //  FindFirst
        System.out.println("Get first dish which cooking time greater than 15 min");
        Optional<Dish> first = menu.stream()
                .filter(dish -> dish.getCookingTime() > 15).findFirst();
        System.out.println(first);
        System.out.println("-----------------------------------------------");

        //  FindAny
        System.out.println("Find any non-vegetarian dish");
        var findAnyDish = menu.stream()
                .filter(Dish::isVegetarian).findAny();
        System.out.println(findAnyDish.orElse(menu.get(3)));
        System.out.println("-----------------------------------------------");

        //  AllMatch
        System.out.println("Is menu vegetarian-friendly (contains only non-meat dishes)?");
        boolean isVegetarianFriendly = menu.stream()
                .allMatch(Dish::isVegetarian);
        System.out.println(isVegetarianFriendly);
        System.out.println("-----------------------------------------------");

        //  AnyMatch
//        boolean isVegetarianFriendly = menu.stream().anyMatch(Dish::isVegetarian);
//        System.out.println();

        //  NoneMatch
        //  Max & min
        System.out.println("Find max by calories and min by cooking time dishes");
        var maxByCalories = menu.stream()
                .max(Comparator.comparing(dish -> dish.getCalories()));
        System.out.println(maxByCalories);
        System.out.println("-----------------------------------------------");

        //  Reduce
        System.out.println("Get sum of calories and total cooking times for non-vegetarian dishes without bread");
        int sumOfCookingTime = menu.stream()
                .filter(dish -> !dish.getIngredients().contains("bread"))
                .map(Dish::getCookingTime)
                .reduce(0, (ct1, ct2) -> ct1 + ct2);
        System.out.println(sumOfCookingTime);
        System.out.println("-----------------------------------------------");

        //  FlatMap
        System.out.println("Get list of unique ingredients in a menu");
        var listOfUniqueIngredients = menu.stream()
                .map(Dish::getIngredients).distinct().toList();
        System.out.println(listOfUniqueIngredients);

    }
}
