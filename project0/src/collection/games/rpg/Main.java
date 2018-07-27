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

        Player stepa = new Player(new Ranger(new Elf(), "Stepanius", 30, 10, 20));
        Player kostya = new Player(new Mage(new Human(), "Kostyanius", 30, 10, 20));
        Player masha = new Player(new Ranger(new Orc(), "Mariania", 30, 10, 20));
        Player lena = new Player(new Priest(new Elf(), "Elenaria", 30, 10, 20));
        Player sasha = new Player(new Priest(new Human(), "Alexandruis", 30, 10, 20));
        Player max = new Player(new Warrior(new Orc(), "Maximus", 30, 10, 20));

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
