package Players.Casters.Defenders;

import Interfaces.IDefend;

public class Dragon implements IDefend {

    int damageReduction = 5;

    public int defend(){
        return this.damageReduction;
    }
}
