package pl.globallogic.sessions.s8;

public class CaloriesExtractor implements DishDataExtractor {

    @Override
    public int extract(Dish dish) {
        return dish.getCalories();
    }
}
