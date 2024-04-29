package pl.globallogic.sessions.s5.polymorphism;

abstract public class Shape {
    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public abstract int area();

    public abstract int perimeter();

    public abstract String type();

    public String getColor() {
        return color;
    }
}
