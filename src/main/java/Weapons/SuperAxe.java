package Weapons;

import Interfaces.IWeapon;

public class SuperAxe implements IWeapon {
    public int numOfDice() {
        return 6;
    }

    public int diceSize() {
        return 12;
    }

    public int baseDamage() {
        return 10;
    }

    public void attack() {

    }


}
