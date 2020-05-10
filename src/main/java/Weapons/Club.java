package Weapons;

import Interfaces.IWeapon;

public class Club implements IWeapon {
    public int numOfDice() {
        return 1;
    }

    public int diceSize() {
        return 6;
    }

    public int baseDamage() {
        return 1;
    }

    public void attack() {

    }
}
