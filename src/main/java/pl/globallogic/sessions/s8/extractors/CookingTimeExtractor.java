package pl.globallogic.sessions.s8.extractors;

import pl.globallogic.sessions.s8.Dish;
import pl.globallogic.sessions.s8.extractors.CaloriesExtractor;

public class CookingTimeExtractor implements CaloriesExtractor.DishDataExtractor {
    @Override
    public int extract(Dish dish) {
        return dish.getCookingTime();
    }
}
