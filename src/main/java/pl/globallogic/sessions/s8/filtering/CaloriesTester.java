package pl.globallogic.sessions.s8.filtering;

import pl.globallogic.sessions.s8.Dish;

public class CaloriesTester implements DishTester {

    private int criteria;
    private TesterOperators operator;

    public CaloriesTester(int criteria, TesterOperators operator) {
        this.criteria = criteria;
        this.operator = operator;
    }

    @Override
    public boolean test(Dish dish) {
        return switch(operator) {
            case EQ -> dish.getCalories() == criteria;
            case GT -> dish.getCalories() > criteria;
            case LT -> dish.getCalories() < criteria;
        };
    }
}
