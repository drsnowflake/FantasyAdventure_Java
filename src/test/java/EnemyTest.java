import Enemies.Melee.Orc;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EnemyTest {

    Orc orcy;

    @Before
    public void before(){
        orcy = new Orc(100);
    }

    @Test
    public void enemyHasHP() {
        assertEquals(100, orcy.getHealthPool());
    }

    @Test
    public void enemyCanTakeDamage(){
        orcy.takeDamage(50);
        assertEquals(50, orcy.getHealthPool());
    }
}
