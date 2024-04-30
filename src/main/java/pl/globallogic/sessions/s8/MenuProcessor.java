package pl.globallogic.sessions.s8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MenuProcessor {

    //  Get total menu calories
    //  Get vegetarian dishes
    //  Get dishes with calories less than 200
    //  Get dishes with calories greater than 350
    //  Get dishes with cooking time greater than 20 min
    //  Get dishes with chilli
    //  Get dishes without milk
    //  Get top 5 calories dishes
    //  Get top 3 vegetarian dishes with calories less than 200

    private Menu menu;

    public MenuProcessor(Menu menu) {
        this.menu = menu;
    }

    public int getTotalCalories() {
        int calories = 0;
        for (Dish dish : menu.getDishes()) {
            calories =+ dish.getCalories();
        }
        return calories;
    }

    public List<Dish> getVegetarianDishes() {
        List<Dish> vegetarianDishes = new ArrayList<>();
        for (Dish dish : menu.getDishes()) {
            if (dish.isVegetarian()) vegetarianDishes.add(dish);
        }
        return vegetarianDishes;
    }

    public List<Dish> getDishesWithCaloriesLessThan200() {
        List<Dish> result = new ArrayList<>();
        for (Dish dish : menu.getDishes()) {
            if (dish.getCalories() <= 200) result.add(dish);
        }
        return result;
    }

    public List<Dish> getDishesWithCaloriesGreaterThan350() {
        List<Dish> result = new ArrayList<>();
        for (Dish dish : menu.getDishes()) {
            if (dish.getCalories() >= 350) result.add(dish);
        }
        return result;
    }

    public List<Dish> getDishesWithCookingTimeGreaterThan20() {
        List<Dish> result = new ArrayList<>();
        for (Dish dish : menu.getDishes()) {
            if (dish.getCookingTime() > 20) result.add(dish);
        }
        return result;
    }

    public List<Dish> getSpicyDishes() {
        List<Dish> result = new ArrayList<>();
        for (Dish dish : menu.getDishes()) {
            if (dish.getIngredients().contains("chilli")) result.add(dish);
        }
        return result;
    }

    public List<Dish> getLactoseFreeDishes() {
        List<Dish> result = new ArrayList<>();
        for (Dish dish : menu.getDishes()) {
            if (!dish.getIngredients().contains("milk")) result.add(dish);
        }
        return result;
    }

    public List<Dish> getTop3DishByCalories() {
        List<Dish> dishesCopy = new ArrayList<>(List.copyOf(menu.getDishes()));
        dishesCopy.sort(new DishByCalories());
        return dishesCopy.subList(0, 3);
    }

    public Dish getTop1VegetarianDishWithCaloriesLessThan200() {
        List<Dish> dishesCopy = new ArrayList<>(List.copyOf(menu.getDishes()));
        dishesCopy.sort(new DishByCalories());
        for (Dish dish : dishesCopy) {
            if (dish.isVegetarian() && dish.getCalories() < 200) {
                return dish;
            }
        }
        return null;
    }
}
