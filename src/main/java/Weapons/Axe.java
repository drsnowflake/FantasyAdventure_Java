package Weapons;

import Interfaces.IWeapon;

public class Axe implements IWeapon {

    public int numOfDice() {
        return 2;
    }

    public int diceSize() {
        return 8;
    }

    public int baseDamage() {
        return 4;
    }

    public void attack() {

    }

}
