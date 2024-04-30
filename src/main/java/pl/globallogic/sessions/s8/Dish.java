package pl.globallogic.sessions.s8;

import java.util.List;
import java.util.Objects;

public class Dish {
    private String name;
    private int calories;
    private int cookingTime;
    private boolean isVegetarian;
    private List<String> ingredients;

    public Dish(String name, int calories, int cookingTime, boolean isVegetarian, List<String> ingredients) {
        this.name = name;
        this.calories = calories;
        this.cookingTime = cookingTime;
        this.isVegetarian = isVegetarian;
        this.ingredients = ingredients;
    }

    public static Dish of(String title, int calories, int cookingTime, boolean isvegetarian, String... ingredients) {
        List<String> ingredientsCopy = List.of(ingredients);
        return new Dish(title, calories, cookingTime, isvegetarian, ingredientsCopy);
    }

    public String getName() {
        return name;
    }

    public int getCalories() {
        return calories;
    }

    public int getCookingTime() {
        return cookingTime;
    }

    public boolean isVegetarian() {
        return isVegetarian;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dish dish = (Dish) o;
        return calories == dish.calories && cookingTime == dish.cookingTime && isVegetarian == dish.isVegetarian && Objects.equals(name, dish.name) && Objects.equals(ingredients, dish.ingredients);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, calories, cookingTime, isVegetarian, ingredients);
    }

    @Override
    public String toString() {
        return "Dish{" +
                "name='" + name + '\'' +
                ", calories=" + calories +
                ", cookingTime=" + cookingTime +
                ", isVegetarian=" + isVegetarian +
                ", ingredients=" + ingredients +
                '}';
    }
}
