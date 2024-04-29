package pl.globallogic.sessions.s6;

import java.util.ArrayList;
import java.util.List;

public class OurGenericClassImpl<T> implements OurGenericList<T> {
    private List<T> list = new ArrayList<>();

    @Override
    public void add(T element) {
        list.add(element);
    }

    @Override
    public T get(int index) {
        return list.get(index);
    }
}
