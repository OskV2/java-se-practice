package pl.globallogic.sessions.s6;

public class DoubleValueSupplier<T extends Number> {

    private T number;

    public void set(T number) {
        this.number = number;
    }

    public double getDoubleFromValue() {
        return number.doubleValue();
    }

}
