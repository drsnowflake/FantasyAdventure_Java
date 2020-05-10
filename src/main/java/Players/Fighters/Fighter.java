package Players.Fighters;

import Enemies.Enemy;
import Interfaces.IWeapon;
import Players.Player;

public abstract class Fighter extends Player {

    IWeapon weapon;

    public Fighter(String name, int healthPool) {
        super(name, healthPool);
    }

    public IWeapon getWeapon() {
        return weapon;
    }

    public void pickupWeapon(IWeapon weapon) {
        this.weapon = weapon;
    }

    public void attack(Enemy enemy){
        if (weapon != null) {
            int damageDealt = 0;
            for (int i = 0; i < weapon.numOfDice(); i++) {
                damageDealt += (int) (Math.random() * (weapon.diceSize())+ 1);
            }
            enemy.takeDamage(damageDealt + weapon.baseDamage());
        } else {
            enemy.takeDamage(2);
        }
    }
}
