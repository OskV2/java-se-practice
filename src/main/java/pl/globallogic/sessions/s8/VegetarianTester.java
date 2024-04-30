package pl.globallogic.sessions.s8;

public class VegetarianTester implements DishTester{

    @Override
    public boolean test(Dish dish) {
        return dish.isVegetarian();
    }
}
