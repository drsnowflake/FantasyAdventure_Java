package Players;

public abstract class Player{
    String name;
    int baseHP;
    int currentHP;


    public Player(String name, int healthPool) {
        this.name = name;
        this.currentHP = healthPool;
        this.baseHP = healthPool;
    }

    public String getName() {
        return name;
    }

    public int getBaseHP() {
        return baseHP;
    }

    public int getCurrentHP() {
        return currentHP;
    }

    public void takeDamage(int damage){
        if (damage >= 0)
        this.currentHP -= damage;
    }

    public void takeHeal(int health){
        if ((this.currentHP + health) > this.baseHP){
            this.currentHP = baseHP;
        } else {
            this.currentHP += health;
        }
    }
}
