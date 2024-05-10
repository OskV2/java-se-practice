package pl.globallogic.exercises.ex40;

public class Hamburger {
    private String name;
    private String meat;
    private double price;
    private String breadRollType;
    private String addition1Name;
    private String addition2Name;
    private String addition3Name;
    private String addition4Name;
    private double addition1Price;
    private double addition2Price;
    private double addition3Price;
    private double addition4Price;

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }

    public void addHamburgerAddition1(String name, double price) {
        this.addition1Name = name;
        this.addition1Price = price;
    }
    public void addHamburgerAddition2(String name, double price) {
        this.addition2Name = name;
        this.addition2Price = price;
    }
    public void addHamburgerAddition3(String name, double price) {
        this.addition3Name = name;
        this.addition3Price = price;
    }
    public void addHamburgerAddition4(String name, double price) {
        this.addition4Name = name;
        this.addition4Price = price;
    }

    public double itemizeHamburger() {
        double totalPrice = price + addition1Price + addition2Price + addition3Price + addition4Price;

        System.out.println("Burgers additional ingredients: ");
        if(addition1Name != null) System.out.printf(addition1Name + ", ");
        if(addition2Name != null) System.out.printf(addition2Name + ", ");
        if(addition3Name != null) System.out.printf(addition3Name + ", ");
        if(addition4Name != null) System.out.printf(addition4Name + ". \n");

        System.out.println("Burger price: " + totalPrice);
        return totalPrice;
    }
}
