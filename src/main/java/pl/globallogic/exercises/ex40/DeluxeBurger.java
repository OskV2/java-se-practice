package pl.globallogic.exercises.ex40;

public class DeluxeBurger extends Hamburger {
    public DeluxeBurger() {
        super("Deluxe Burger", "Default", 19.10, "Default");
        addHamburgerAddition1("Fixings", 0);
        addHamburgerAddition1("Chips", 0);
        addHamburgerAddition1("Drink", 0);
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("No additional items can be added to a deluxe burger. Everything is already added");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("No additional items can be added to a deluxe burger. Everything is already added");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("No additional items can be added to a deluxe burger. Everything is already added");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("No additional items can be added to a deluxe burger. Everything is already added");
    }
}
