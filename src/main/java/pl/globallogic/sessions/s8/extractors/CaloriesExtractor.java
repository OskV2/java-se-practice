package pl.globallogic.sessions.s8.extractors;

import pl.globallogic.sessions.s8.Dish;

public class CaloriesExtractor implements DishDataExtractor {

    @Override
    public int extract(Dish dish) {
        return dish.getCalories();
    }
}
