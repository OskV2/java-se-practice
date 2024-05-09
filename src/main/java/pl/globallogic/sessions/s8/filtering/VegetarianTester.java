package pl.globallogic.sessions.s8.filtering;

import pl.globallogic.sessions.s8.Dish;
import pl.globallogic.sessions.s8.filtering.DishTester;

public class VegetarianTester implements DishTester {

    @Override
    public boolean test(Dish dish) {
        return dish.isVegetarian();
    }
}
