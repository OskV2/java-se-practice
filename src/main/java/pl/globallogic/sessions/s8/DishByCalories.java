package pl.globallogic.sessions.s8;

import java.util.Comparator;

public class DishByCalories implements Comparator<Dish> {
    @Override
    public int compare(Dish o1, Dish o2) {
        return Integer.compare(o1.getCalories(), o2.getCalories());
    }
}
