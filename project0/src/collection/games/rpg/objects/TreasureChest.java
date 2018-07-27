package collection.games.rpg.objects;

import collection.games.rpg.interfaces.Targetable;

public class TreasureChest extends Container implements Targetable {

    @Override
    public String[] actionsOnTarget() {
        return new String[]{"Loot"};
    }

}