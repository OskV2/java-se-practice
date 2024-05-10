package pl.globallogic.exercises.ex39;

public class Holden extends Car {
    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public void startEngine() {
        System.out.println("Holden's engine is starting");
    }

    @Override
    public void accelerate() {
        System.out.println("Holden is accelerating");
    }

    @Override
    public void brake() {
        System.out.println("Holden is braking");
    }
}
