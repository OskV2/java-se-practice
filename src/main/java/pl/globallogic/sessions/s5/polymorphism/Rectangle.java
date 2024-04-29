package pl.globallogic.sessions.s5.polymorphism;

public class Rectangle extends Shape {
    private int sideA;
    private int sideB;

    public Rectangle(String color, int sideA, int sideB) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public int perimeter() {
        return (2 * sideA) + (2 * sideB);
    }

    @Override
    public int area() {
        return sideA * sideB;
    }

    @Override
    public String type() {
        return "Rectangle";
    }
}
