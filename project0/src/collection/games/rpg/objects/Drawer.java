package collection.games.rpg.objects;

import collection.games.rpg.interfaces.Targetable;

public class Drawer extends Container implements Targetable {

    @Override
    public String[] actionsOnTarget() {
        return new String[]{"Punch", "Loot"};
    }

}