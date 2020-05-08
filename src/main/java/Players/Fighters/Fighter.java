package Players.Fighters;

import Interfaces.IWeapon;
import Players.Player;

public abstract class Fighter extends Player {

    IWeapon weapon;

    public Fighter(String name, int healthPool) {
        super(name, healthPool);
    }

    public void pickupWeapon(IWeapon weapon) {
    }
}
