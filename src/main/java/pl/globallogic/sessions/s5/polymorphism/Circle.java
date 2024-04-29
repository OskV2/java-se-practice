package pl.globallogic.sessions.s5.polymorphism;

public class Circle extends Shape {
    private int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public int area() {
        return (int) Math.PI * radius * radius;
    }

    @Override
    public int perimeter() {
        return (int)(2 * Math.PI * radius);
    }

    @Override
    public String type() {
        return "Circle";
    }
}
