package Spells.Heals;

import Interfaces.IHeal;

public class LayOnHands implements IHeal {
    public int numOfDice() {
        return 10000;
    }

    public int diceSize() {
        return 1;
    }

    public void heal() {

    }
}
