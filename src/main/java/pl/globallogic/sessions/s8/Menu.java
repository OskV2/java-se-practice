package pl.globallogic.sessions.s8;

import java.util.List;

public class Menu {
    private String title;
    private List<Dish> dishes;

    public Menu(String title, List<Dish> dishes) {
        this.title = title;
        this.dishes = dishes;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Dish> getDishes() {
        return dishes;
    }

    public void setDishes(List<Dish> dishes) {
        this.dishes = dishes;
    }
}
