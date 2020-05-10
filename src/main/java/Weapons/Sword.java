package Weapons;

import Interfaces.IWeapon;

public class Sword implements IWeapon {
    public int numOfDice() {
        return 3;
    }

    public int diceSize() {
        return 6;
    }

    public int baseDamage() {
        return 2;
    }

    public void attack() {

    }
}
