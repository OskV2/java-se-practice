package pl.globallogic.sessions.s8;

import pl.globallogic.sessions.s8.extractors.CaloriesExtractor;
import pl.globallogic.sessions.s8.extractors.CookingTimeExtractor;
import pl.globallogic.sessions.s8.filtering.CaloriesTester;
import pl.globallogic.sessions.s8.filtering.DishTester;
import pl.globallogic.sessions.s8.filtering.TesterOperators;
import pl.globallogic.sessions.s8.filtering.VegetarianTester;

import java.util.ArrayList;
import java.util.List;

public class EnhancedMenuProcessor {
    private Menu menu;

    public EnhancedMenuProcessor(Menu menu) {
        this.menu = menu;
    }

    public int sumOfCalories(Menu menu) {
        return totalSumOf(menu, new CaloriesExtractor());
    }

    public int totalCookingTime() {
//        return totalSumOf(menu, new CookingTimeExtractor());
        return totalSumOf(menu, dish -> dish.getCookingTime());
    }

    public List<Dish> getVegetarianDishes(Menu menu) {
        return filterBy(menu, List.of(new VegetarianTester()));
    }

    public List<Dish> getDishesLtSpecificCalories(Menu menu, int criteria) {
        return filterBy(menu, List.of(new CaloriesTester(criteria, TesterOperators.LT)));
    }

    private List<Dish> filterBy(Menu menu, List<DishTester> dishTester) {
        List<Dish> result = new ArrayList<>();
        for (Dish dish : menu.getDishes()) {
            boolean isTested = true;
            for (DishTester tester : dishTester) {
                if (!tester.test(dish)) {
                    isTested = false;
                    break;
                }
                if (isTested) result.add(dish);
            }
        }
        return result;
    }

    private int totalSumOf(Menu menu, CaloriesExtractor.DishDataExtractor extractor) {
        int total = 0;
        for (Dish dish : menu.getDishes()) {
            total = total + extractor.extract(dish);
        }
        return total;
    }

    private List<Dish> maxOfCalories(Menu menu, CaloriesExtractor.DishDataExtractor extractor) {
        int max = extractor.extract(menu.getDishes().getFirst());
        for (Dish dish : menu.getDishes()) {
            max = Math.max(max, extractor.extract(dish));
        }
        int finalMax = max;
//        DishTester filterByMaxCalories = new DishTester() {
//            @Override
//            public boolean test(Dish dish) {
//                return dish.getCalories() == finalMax;
//            }
//        };
        DishTester filterByMaxCalories = dish -> dish.getCalories() == finalMax;
        return filterBy(menu, List.of(filterByMaxCalories));
    }

    private int minOf(Menu menu, CaloriesExtractor.DishDataExtractor extractor) {

    }
}
