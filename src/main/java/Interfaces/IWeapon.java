package Interfaces;

import Enemies.Enemy;

public interface IWeapon {

    public int damage();

    public void attack(Enemy enemy);
}
