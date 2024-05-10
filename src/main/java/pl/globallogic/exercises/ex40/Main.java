package pl.globallogic.exercises.ex40;

public class Main {
    public static void main(String[] args) {

        //  My output is different than the one in the task command but that's because the command is imprecise and doesn't define where the console logs should be.
        //  Overall software is working, and price calculation works as it should because there isnt anything difficult here
        //  But i got tired when doing this task, because task command is written so bad.

        // Actually i dont think that its bad that that my output is different because task command had "Example Output"

        Hamburger hamburger = new Hamburger("Basic", "Sausage", 3.56, "White");
        hamburger.addHamburgerAddition1("Tomato", 0.27);
        hamburger.addHamburgerAddition2("Lettuce", 0.75);
        hamburger.addHamburgerAddition3("Cheese", 1.13);
        System.out.println("Total Burger price is " + hamburger.itemizeHamburger());
        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);
        healthyBurger.addHamburgerAddition1("Egg", 5.43);
        healthyBurger.addHealthyAddition1("Lentils", 3.41);
        System.out.println("Total Healthy Burger price is  " + healthyBurger.itemizeHamburger());
        DeluxeBurger db = new DeluxeBurger();
        db.addHamburgerAddition3("Should not do this", 50.53);
        System.out.println("Total Deluxe Burger price is " + db.itemizeHamburger());
    }
}
