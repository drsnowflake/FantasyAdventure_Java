package Enemies;

public abstract class Enemy {

    private int healthPool;

    public Enemy(int healthPool) {
        this.healthPool = healthPool;
    }

    public int getHealthPool() {
        return healthPool;
    }

    public void takeDamage(int damage) {
        this.healthPool += -damage;
    }



}
