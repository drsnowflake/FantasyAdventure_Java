package Spells.Heals;

import Interfaces.IHeal;

public class Potion implements IHeal {
    public int numOfDice() {
        return 3;
    }

    public int diceSize() {
        return 4;
    }

    public void heal() {

    }
}
