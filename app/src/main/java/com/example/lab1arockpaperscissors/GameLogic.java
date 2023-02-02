package com.example.lab1arockpaperscissors;

public class GameLogic {
    private final int NUM_WEAPONS;

    public GameLogic() {
        NUM_WEAPONS = Weapon.values().length;

    }

    public void ComputerChoice(int num) {
        for (int i = 0; i < num; ++i) {
            int weaponNum = (int) (Math.random() * NUM_WEAPONS);
            Weapon w = Weapon.values() [weaponNum];
            w.ordinal();

        }


    }

}
