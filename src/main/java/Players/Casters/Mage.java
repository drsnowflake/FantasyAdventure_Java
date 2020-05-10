package Players.Casters;

import Enemies.Enemy;
import Interfaces.IDefend;
import Interfaces.ISpell;
import Players.Player;

public abstract class Mage extends Player {

    ISpell spell;
    IDefend defender;

    public Mage(String name, int healthPool) {
        super(name, healthPool);
    }

    public ISpell getSpell(){
        return spell;
    }

    public void changeSpell(ISpell spell){
        this.spell = spell;
    }

    public void pickDefender(IDefend defender){
        this.defender = defender;
    }

    public void cast(Enemy enemy){
        int damageDealt = 0;
        if (spell != null){
            for (int i = 0; i < spell.numOfDice(); i++) {
                damageDealt += (int) (Math.random() * (spell.diceSize()) +1 );
            }
        }
        enemy.takeDamage(damageDealt);
    }

    public void getAttacked(int damage){
        if (defender == null){
            this.takeDamage(damage);
        } else {
            this.takeDamage(damage - defender.defend());
        }

    }
}
