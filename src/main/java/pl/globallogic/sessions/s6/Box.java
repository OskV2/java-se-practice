package pl.globallogic.sessions.s6;

public class Box<T> {

    private T t;

    public void set (T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }

}
