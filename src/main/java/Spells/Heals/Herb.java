package Spells.Heals;

import Interfaces.IHeal;

public class Herb implements IHeal {
    public int numOfDice() {
        return 1;
    }

    public int diceSize() {
        return 4;
    }

    public void heal() {

    }
}
