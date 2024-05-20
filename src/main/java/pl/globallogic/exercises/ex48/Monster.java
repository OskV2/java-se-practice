package pl.globallogic.exercises.ex48;

import java.util.ArrayList;
import java.util.List;

public class Monster implements ISaveable {
    private String name;
    private int hitPoints;
    private int strength;

    public Monster(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", hitPoints=" + hitPoints +
                ", strength=" + strength +
                '}';
    }

    @Override
    public List write() {
        List fields = new ArrayList<>();
        fields.add(0, name);
        fields.add(1, hitPoints);
        fields.add(2, strength);
        return fields;
    }

    @Override
    public void read(List<String> list) {
        if (list.isEmpty() || list.size() < 0) return;
        this.name = list.get(0);
        this.hitPoints = Integer.parseInt(list.get(1));
        this.strength = Integer.parseInt(list.get(2));
    }
}