package Weapons;

import Enemies.Enemy;
import Interfaces.IWeapon;

public class Axe implements IWeapon {

    public int damage() {
        return 5;
    }

    public void attack(Enemy enemy) {
        enemy.takeDamage(this.damage());
    }
}
