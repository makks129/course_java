package collection.games.rpg;

import collection.games.rpg.creatures.heros.Hero;
import collection.games.rpg.creatures.mosters.Boss;
import collection.games.rpg.creatures.mosters.Monster;
import collection.games.rpg.creatures.mosters.Saruman;
import collection.games.rpg.creatures.mosters.Sauron;
import collection.games.rpg.locations.City;
import collection.games.rpg.locations.Dungeon;
import collection.games.rpg.locations.Zone;

public class Game {

    private static Game[] games;
    private static int gamesCount;

    private Player[] players;
    private int playersCount;

    private Zone zoneEriador;
    private Zone zoneRohan;
    private Zone zoneGondor;
    private Zone zoneMordor;
    private City cityShire;
    private City cityEdoras;
    private City cityMinasTirith;
    private City cityMinasMorgul;
    private Dungeon dungeonMinesOfIsengard;
    private Dungeon dungeonMinesOfMordor;

    public Game() {
        games = new Game[3]; // we have 3 game servers, can create 3 games
        games[gamesCount++] = this; // x++ means: use current value of x and then increment by 1

        players = new Player[100]; // each server can host up to 100 players
    }

    public void loadGameWorld() {
        zoneEriador = new Zone("Eriador");
        zoneRohan = new Zone("Rohan");
        zoneGondor = new Zone("Gondor");
        zoneMordor = new Zone("Mordor");

        cityShire = new City("Shire");
        cityEdoras = new City("Edoras");
        cityMinasTirith = new City("Minas Tirith");
        cityMinasMorgul = new City("Minas Morgul");


        Monster[] minesOfIsengardMonsters = {
                new Monster("Little angry monster", 100, 5, 1, 3),
                new Monster("Little dirty monster", 100, 5, 1, 3),
                new Monster("Little smelly monster", 100, 5, 1, 3),
                new Monster("Big angry monster", 200, 10, 1, 6),
                new Monster("Big dirty monster", 200, 10, 1, 6)
        };
        Boss saruman = new Saruman();
        dungeonMinesOfIsengard = new Dungeon("Mines Of Isengard", minesOfIsengardMonsters, saruman);

        Monster[] minesOfMordorMonsters = {
                new Monster("Little angry monster", 100, 5, 1, 3),
                new Monster("Little dirty monster", 100, 5, 1, 3),
                new Monster("Little smelly monster", 100, 5, 1, 3),
                new Monster("Big angry monster", 200, 10, 1, 6),
                new Monster("Big dirty monster", 200, 10, 1, 6)
        };
        Boss sauron = new Sauron();
        dungeonMinesOfMordor = new Dungeon("Mines Of Mordor", minesOfMordorMonsters, sauron);

        // TODO can directly create Location object - disable!
    }

    public void addPlayer(Player player) {
        players[playersCount++] = player;
    }


    public void runGameWorld() {

        Hero stepanius = getHeroByName("Stepanius");
        Hero kostyanius = getHeroByName("Kostyanius");
        Hero mariania = getHeroByName("Mariania");
        Hero elenaria = getHeroByName("Elenaria");
        Hero alexandruis = getHeroByName("Alexandruis");
        Hero maximus = getHeroByName("Maximus");

        zoneEriador.addHero(stepanius);
        zoneEriador.addHero(kostyanius);
        zoneEriador.addHero(mariania);
        zoneEriador.addHero(elenaria);
        zoneEriador.addHero(alexandruis);
        zoneEriador.addHero(maximus);

        printAllPlayersLocations();

        dungeonMinesOfIsengard.addHero(stepanius);
        dungeonMinesOfIsengard.addHero(kostyanius);
        dungeonMinesOfIsengard.addHero(mariania);
        cityShire.addHero(elenaria);
        cityShire.addHero(alexandruis);
        cityShire.addHero(maximus);

        printAllPlayersLocations();


//        dungeonMinesOfIsengard.heroesStartFightingBoss();


        // TODO add game mechanics - attacking creatures!

    }

    private Hero getHeroByName(String name) {
        for (int i = 0; i < playersCount; i++) {
            Hero hero = players[i].getHero();
            if (hero.getName().equals(name)) {
                return hero;
            }
        }
        return null;
    }

    private void printAllPlayersLocations() {
        for (int i = 0; i < playersCount; i++) {
            Hero hero = players[i].getHero();
            String currentLocationName = hero.getCurrentLocation().getName();
            System.out.println("Hero " + hero.getName() + " is in " + currentLocationName);
        }
    }

}
