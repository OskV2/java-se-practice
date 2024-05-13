package pl.globallogic.exercises.ex48;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Player player = new Player("Tim", 10, 15);
        System.out.println("Player: " + player);

        player.setHitPoints(8);
        System.out.println("Updated Player: " + player);
        player.setName("Bob");
        player.setWeapon("Stormbringer");
        System.out.println("Loaded Player: " + player);

        Monster monster = new Monster("Werewolf", 20, 40);
        System.out.println("Monster: " + monster);

        System.out.println(player.write());
        System.out.println(monster.write());
    }
}
