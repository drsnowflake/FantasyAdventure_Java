package Spells.Offensive;

import Interfaces.ISpell;

public class Fireball implements ISpell {
    public int numOfDice() {
        return 1;
    }

    public int diceSize() {
        return 12;
    }

    public void cast() {

    }
}
