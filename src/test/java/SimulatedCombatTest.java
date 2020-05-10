import Enemies.Melee.Orc;
import Players.Fighters.Barbarian;
import Weapons.Axe;
import Weapons.Club;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SimulatedCombatTest {

    Barbarian barb;
    Axe axe;
    Orc orc;
    Club club;

    @Before
    public void before(){
        barb = new Barbarian("Brian", 35);
        axe = new Axe();
        orc = new Orc(100);
        club = new Club();
    }

    @Test
    public void barbOnly(){
        barb.pickupWeapon(axe);
        System.out.println("One Sided Combat");
        System.out.println("Orc starting HP: " + orc.getHealthPool());
        int orcHP;
        while (orc.getHealthPool() != 0){
            orcHP = orc.getHealthPool();
            barb.attack(orc);
            System.out.println("Barb hit Orc for: " + (orcHP - orc.getHealthPool()) + " -- Orc has " + orc.getHealthPool() + "HP");
        }
        assertEquals(0, orc.getHealthPool());
    }

    @Test
    public void twoWayCombat(){
        barb.pickupWeapon(axe);
        orc.pickupWeapon(club);
        System.out.println();
        System.out.println("Two Way Combat");
        System.out.println(barb.getName() + " starting HP: " + barb.getCurrentHP());
        System.out.println("Orc starting HP: " + orc.getHealthPool());
        int orcHP = orc.getHealthPool();
        int barbHP = barb.getCurrentHP();
        int counter = 1;
        while ((orc.getHealthPool() != 0) && (barb.getCurrentHP() !=0 )){
            System.out.println();
            System.out.println("Combat round: " + counter);
            if (barbHP != 0) {
                barb.attack(orc);
                System.out.println(barb.getName() + " hit Orc for: " + (orcHP - orc.getHealthPool()) + " -- Orc has " + orc.getHealthPool() + "HP");
                orcHP = orc.getHealthPool();
            }
            if (orcHP != 0) {
                orc.attack(barb);
                System.out.println("Orc hit " + barb.getName() + " for: " + (barbHP - barb.getCurrentHP()) + " -- " + barb.getName() + " has " + barb.getCurrentHP() + "HP");
                barbHP = barb.getCurrentHP();
            }
            counter ++;
        }
        System.out.println();
        if (orcHP == 0){
            System.out.println(barb.getName() + " was victorious!");
        } else {
            System.out.println(barb.getName() + " has fallen victim to Orc");
        }
    }
}
