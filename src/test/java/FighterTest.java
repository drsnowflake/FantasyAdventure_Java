import Enemies.Melee.Orc;
import Players.Fighters.Barbarian;
import Weapons.Axe;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FighterTest {

    Barbarian barb;
    Orc orc;
    Axe axe;

    @Before
    public void before(){
        barb = new Barbarian("Steve", 20);
        orc = new Orc(100);
        axe = new Axe();
    }

    @Test
    public void fighterHasHP() {
        assertEquals(20, barb.getCurrentHP());
    }

    @Test
    public void fighterHasWeapon() {
        barb.pickupWeapon(axe);
        assertEquals(axe, barb.getWeapon());
    }

    @Test
    public void fighterCanTakeDamage(){
        barb.takeDamage(5);
        assertEquals(15, barb.getCurrentHP());
        assertEquals(20, barb.getBaseHP());
    }

    @Test
    public void fighterCannotExceedBaseHP(){
        barb.takeDamage(6);
        barb.takeHeal(10000);
        assertEquals(20, barb.getCurrentHP());
    }

    @Test
    public void fighterCanDealDamage(){
        barb.pickupWeapon(axe);
        barb.attack(orc);
        assertTrue(orc.getHealthPool() != 100);
    }

    @Test
    public void fighterCanDealDamageUnarmed(){
        barb.attack(orc);
        assertEquals(98, orc.getHealthPool());
    }

    @Test
    public void fighterCanSwitchWeaponInCombat(){
        barb.attack(orc);
        System.out.println(orc.getHealthPool());
        assertEquals(98, orc.getHealthPool());
        barb.pickupWeapon(axe);
        barb.attack(orc);
        System.out.println(orc.getHealthPool());
        assertTrue(orc.getHealthPool() < 94);
    }
}
