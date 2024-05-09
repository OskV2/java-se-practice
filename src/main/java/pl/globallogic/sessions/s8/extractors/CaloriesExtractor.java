package pl.globallogic.sessions.s8.extractors;

import pl.globallogic.sessions.s8.Dish;

public class CaloriesExtractor implements CaloriesExtractor.DishDataExtractor {

    @Override
    public int extract(Dish dish) {
        return dish.getCalories();
    }

    public static interface DishDataExtractor {
        int extract(Dish dish);
    }
}
