package Players.Casters.Defenders;

import Interfaces.IDefend;

public class Ogre implements IDefend {

    int damageReduction = 2;

    public int defend(){
        return this.damageReduction;
    }
}
