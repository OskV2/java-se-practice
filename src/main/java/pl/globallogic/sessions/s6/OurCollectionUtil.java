package pl.globallogic.sessions.s6;

import java.util.List;

public class OurCollectionUtil {
    public static <T> void fill(List<T> list, T val) {
        for (int i=0; i < list.size(); i++) {
            list.set(i, val);
        }
    }
}
