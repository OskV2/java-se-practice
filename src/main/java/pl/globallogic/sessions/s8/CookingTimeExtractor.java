package pl.globallogic.sessions.s8;

public class CookingTimeExtractor implements DishDataExtractor {
    @Override
    public int extract(Dish dish) {
        return dish.getCookingTime();
    }
}
