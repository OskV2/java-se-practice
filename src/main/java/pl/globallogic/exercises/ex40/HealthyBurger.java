package pl.globallogic.exercises.ex40;

public class HealthyBurger extends Hamburger {
    private String healthyExtra1Name;
    private String healthyExtra2Name;
    private double healthyExtra1Price;
    private double healthyExtra2Price;

    public HealthyBurger(String meat, double price) {
        super ("Default", meat, price, "Default");
    }

    public void addHealthyAddition1(String name, double price) {
        this.healthyExtra1Name = name;
        this.healthyExtra1Price = price;
    }

    public void addHealthyAddition2(String name, double price) {
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;
    }

    @Override
    public double itemizeHamburger() {
        double totalPrice = super.itemizeHamburger() + healthyExtra1Price + healthyExtra2Price;
        System.out.printf("Burgers additional ingredients: %s, %s \n", healthyExtra1Name, healthyExtra2Name);
        System.out.println("Burger price: " + totalPrice);
        return totalPrice;
    }
}
