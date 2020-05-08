import Enemies.Melee.Orc;
import Interfaces.IWeapon;
import Players.Fighters.Barbarian;
import Weapons.Axe;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RandomTests {

    Barbarian barb;
    Orc orcy;
    Axe axe;

    @Before
    public void before(){
        barb = new Barbarian("Steve", 20);
        orcy = new Orc(10);
        axe = new Axe();
    }

    @Test
    public void playerHasHP() {
        assertEquals(20, barb.getCurrentHP());
    }

    @Test
    public void enemyHasHP() {
        assertEquals(10, orcy.getHealthPool());
    }

    @Ignore
    @Test
    public void playerHasWeapon() {
        barb.pickupWeapon(axe);
        assertEquals(5, orcy.getHealthPool());
    }

    @Test
    public void playerCanTakeDamage(){
        barb.takeDamage(5);
        assertEquals(15, barb.getCurrentHP());
        assertEquals(20, barb.getBaseHP());
    }

    @Test
    public void playerCannotExceedBaseHP(){
        barb.takeDamage(6);
        barb.takeHeal(10000);
        assertEquals(20, barb.getCurrentHP());
    }
}
