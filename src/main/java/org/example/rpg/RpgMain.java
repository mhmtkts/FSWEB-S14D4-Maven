package org.example.rpg;

public class RpgMain {
    public static void main(String[] args) {
        Monster shrek = new Troll("shrek", 1000, 50);
        Monster fiona = new Troll("fiona", 800, 60);

        printAttackResult(shrek);
        printAttackResult(fiona);
    }

    private static void printAttackResult(Monster monster) {
        System.out.println("attack result of " + monster.getName()+ ": " + monster.attack());
    }
}
