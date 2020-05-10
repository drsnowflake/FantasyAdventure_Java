package Enemies;

import Interfaces.IWeapon;
import Players.Fighters.Barbarian;
import Players.Player;

public abstract class Enemy {

    IWeapon weapon;

    private int healthPool;

    public Enemy(int healthPool) {
        this.healthPool = healthPool;
    }

    public int getHealthPool() {
        return healthPool;
    }

    public void takeDamage(int damage) {
        if ((this.healthPool - damage) >= 0){
            this.healthPool -= damage;
        } else {
            this.healthPool = 0;
        }
    }

    public void pickupWeapon(IWeapon weapon){
        this.weapon = weapon;
    }


    public void attack(Player player){
        if (weapon != null) {
            int damageDealt = 0;
            for (int i = 0; i < weapon.numOfDice(); i++) {
                damageDealt += (int) (Math.random() * (weapon.diceSize())+ 1);
            }
            player.takeDamage(damageDealt + weapon.baseDamage());
        } else {
            player.takeDamage(2);
        }
    };
}
