package Players.Healer;

import Interfaces.IHeal;
import Players.Player;

public class Cleric extends Player {

    IHeal healSpell;

    public Cleric(String name, int healthPool) {
        super(name, healthPool);
    }

    public IHeal getHeal() {
        return healSpell;
    }

    public void changeHeal(IHeal heal){
        this.healSpell = heal;
    }

    public void healFriendly(Player friendly){
        int healAmount = 0;
        if (healSpell != null){
            for (int i = 0; i < healSpell.numOfDice(); i++){
                healAmount += (int) (Math.random() * (healSpell.diceSize())+ 1);
            }
        }
        friendly.takeHeal(healAmount);
    }
}
