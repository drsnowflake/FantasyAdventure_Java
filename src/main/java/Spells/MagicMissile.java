package Spells;

import Interfaces.ISpell;

public class MagicMissile implements ISpell {
    public int numOfDice() {
        return 2;
    }

    public int diceSize() {
        return 4;
    }

    public void cast() {

    }
}
