import Players.Fighters.Barbarian;
import Players.Healer.Cleric;
import Spells.Heals.Herb;
import Spells.Heals.LayOnHands;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class HealerTest {

    Cleric cleric;
    Herb herb;
    LayOnHands loh;
    Barbarian barb;

    @Before
    public void before(){
        cleric = new Cleric("Omin", 25);
        barb = new Barbarian("Steve", 50);
        herb = new Herb();
        loh = new LayOnHands();
    }

    @Test
    public void clericHasHP() {
        assertEquals(25, cleric.getCurrentHP());
    }

    @Test
    public void clericWontHeal() {
        barb.takeDamage(25);
        cleric.healFriendly(barb);
        assertEquals(25, barb.getCurrentHP());
    }

    @Test
    public void clericCanHeal() {
        barb.takeDamage(25);
        cleric.changeHeal(herb);
        cleric.healFriendly(barb);
        assertTrue(barb.getCurrentHP() > 25);
        assertTrue(barb.getCurrentHP() < 50);
    }

    @Test
    public void clericCantOverheal() {
        barb.takeDamage(49);
        assertEquals(1,barb.getCurrentHP());
        cleric.changeHeal(loh);
        cleric.healFriendly(barb);
        assertEquals(50, barb.getCurrentHP());
    }


}
