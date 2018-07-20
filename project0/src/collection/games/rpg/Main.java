package collection.games.rpg;

import collection.games.rpg.creatures.heros.Mage;
import collection.games.rpg.creatures.heros.Priest;
import collection.games.rpg.creatures.heros.Ranger;
import collection.games.rpg.creatures.heros.Warrior;
import collection.games.rpg.creatures.races.Elf;
import collection.games.rpg.creatures.races.Human;
import collection.games.rpg.creatures.races.Orc;

public class Main {

    public static void main(String[] args) {

        Game game = new Game();

        Player stepa = new Player(new Ranger(new Elf(), "Stepanius", 700, 30, 10, 20));
        Player kostya = new Player(new Mage(new Human(), "Kostyanius", 800, 30, 10, 20));
        Player masha = new Player(new Ranger(new Orc(), "Mariania", 900, 30, 10, 20));
        Player lena = new Player(new Priest(new Elf(), "Elenaria", 700, 30, 10, 20));
        Player sasha = new Player(new Priest(new Human(), "Alexandruis", 700, 30, 10, 20));
        Player max = new Player(new Warrior(new Orc(), "Maximus", 1000, 30, 10, 20));
        // TODO can directly create Hero object - disable!
        // TODO can directly create Race object - disable!
        // TODO calculate HP and attributes base on hero type and race

        game.addPlayer(stepa);
        game.addPlayer(kostya);
        game.addPlayer(masha);
        game.addPlayer(lena);
        game.addPlayer(sasha);
        game.addPlayer(max);

        game.loadGameWorld();
        game.runGameWorld();

    }

}
