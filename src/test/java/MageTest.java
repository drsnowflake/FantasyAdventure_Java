import Enemies.Melee.Orc;
import Players.Casters.Defenders.Dragon;
import Players.Casters.Warlock;
import Spells.Offensive.MagicMissile;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MageTest {

    Warlock lock;
    Orc orc;
    MagicMissile mm;
    Dragon dragon;

    @Before
    public void before(){
        lock = new Warlock("Mike", 10);
        orc = new Orc(100);
        mm = new MagicMissile();
        dragon = new Dragon();
    }

    @Test
    public void casterHasHP() {
        assertEquals(10, lock.getCurrentHP());
    }

    @Test
    public void casterHasSpell() {
        lock.changeSpell(mm);
        assertEquals(mm, lock.getSpell());
    }

    @Test
    public void casterCanTakeDamage(){
        lock.getAttacked(5);
        assertEquals(5, lock.getCurrentHP());
        assertEquals(10, lock.getBaseHP());
    }

    @Test
    public void casterCanReduceDamage(){
        lock.pickDefender(dragon);
        lock.getAttacked(3);
        assertEquals(10, lock.getCurrentHP());
    }

    @Test
    public void casterCannotExceedBaseHP(){
        lock.getAttacked(6);
        lock.takeHeal(10000);
        assertEquals(10, lock.getCurrentHP());
    }

    @Test
    public void casterCanDealDamage(){
        lock.changeSpell(mm);
        lock.cast(orc);
        assertTrue(orc.getHealthPool() != 100);
    }

    @Test
    public void casterCannotDealDamageUnarmed(){
        lock.cast(orc);
        assertEquals(100, orc.getHealthPool());
    }

    @Test
    public void casterCanSwitchSpellInCombat(){
        lock.cast(orc);
        System.out.println(orc.getHealthPool());
        assertEquals(100, orc.getHealthPool());
        lock.changeSpell(mm);
        lock.cast(orc);
        System.out.println(orc.getHealthPool());
        assertTrue(orc.getHealthPool() != 100);
    }

}
