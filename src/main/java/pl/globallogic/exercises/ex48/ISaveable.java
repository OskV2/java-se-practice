package pl.globallogic.exercises.ex48;

import java.util.List;

public interface ISaveable {
    List write();
    void read(List<String> list);
}
