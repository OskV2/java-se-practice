package pl.globallogic.sessions.s8;

import java.util.ArrayList;
import java.util.List;

public class MenuProcessorTest {
    public static void main(String[] args) {
        List<Dish> dishList = new ArrayList<>(
                List.of(
                        Dish.of("Pasta", 450, 30, false, "pasta", "cheese", "tomato", "olive oil"),
                        Dish.of("Pizza", 600, 20, false, "flower", "cheese", "tomato", "ham"),
                        Dish.of("Hot Dog", 250, 15, false, "white bread", "sasuage", "mustard"),
                        Dish.of("Ham Sandwich", 250, 10, false, "bread", "ham", "sauce", "salad"),
                        Dish.of("Tofu Sandwich", 120, 5, true, "tofu"),
                        Dish.of("Vegan biryani", 150, 30, true, "soy", "olive oil", "bread", "salad")
                )
        );

        Menu lunchMenu = new Menu("Lunch menu", dishList);
    }
}
