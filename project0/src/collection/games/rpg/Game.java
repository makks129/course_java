package collection.games.rpg;

import collection.games.rpg.actions.Duel;
import collection.games.rpg.creatures.heros.Hero;
import collection.games.rpg.creatures.mosters.Boss;
import collection.games.rpg.creatures.mosters.Monster;
import collection.games.rpg.creatures.mosters.Saruman;
import collection.games.rpg.creatures.mosters.Sauron;
import collection.games.rpg.locations.City;
import collection.games.rpg.locations.Dungeon;
import collection.games.rpg.locations.Zone;
import collection.io.SmartScanner;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game {

    private static List<Game> games;

    private SmartScanner scanner;

    private List<Player> players;

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
        games = new ArrayList<>(); // we have 3 game servers, can create 3 games
        games.add(this); // x++ means: use current value of x and then increment by 1
        players = new ArrayList<>(); // each server can host up to 100 players
        scanner = new SmartScanner();
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

        List<Monster> minesOfIsengardMonsters = new ArrayList<>();
        minesOfIsengardMonsters.add(new Monster("Little angry monster", 5, 1, 3));
        minesOfIsengardMonsters.add(new Monster("Little dirty monster", 5, 1, 3));
        minesOfIsengardMonsters.add(new Monster("Little smelly monster", 5, 1, 3));
        minesOfIsengardMonsters.add(new Monster("Big angry monster", 10, 1, 6));
        minesOfIsengardMonsters.add(new Monster("Big dirty monster", 10, 1, 6));
        Boss saruman = new Saruman();
        dungeonMinesOfIsengard = new Dungeon("Mines Of Isengard", minesOfIsengardMonsters, saruman);

        List<Monster> minesOfMordorMonsters = new ArrayList<>();
        minesOfIsengardMonsters.add(new Monster("Little angry monster", 5, 1, 3));
        minesOfIsengardMonsters.add(new Monster("Little dirty monster", 5, 1, 3));
        minesOfIsengardMonsters.add(new Monster("Little smelly monster", 5, 1, 3));
        minesOfIsengardMonsters.add(new Monster("Big angry monster", 10, 1, 6));
        minesOfIsengardMonsters.add(new Monster("Big dirty monster", 10, 1, 6));
        Boss sauron = new Sauron();
        dungeonMinesOfMordor = new Dungeon("Mines Of Mordor", minesOfMordorMonsters, sauron);
    }

    public void addPlayer(Player player) {
        players.add(player);
    }


    public void runGameWorld() {

        Hero stepanius = getHeroByName("Stepanius");
        Hero kostyanius = getHeroByName("Kostyanius");
        Hero mariania = getHeroByName("Mariania");
        Hero elenaria = getHeroByName("Elenaria");
        Hero alexandruis = getHeroByName("Alexandruis");
        Hero maximus = getHeroByName("Maximus");

//        printAllHeroesHealth();

//        zoneEriador.changeLocation(stepanius);
//        zoneEriador.changeLocation(kostyanius);
//        zoneEriador.changeLocation(mariania);
//        zoneEriador.changeLocation(elenaria);
//        zoneEriador.changeLocation(alexandruis);
//        zoneEriador.changeLocation(maximus);
//
//        printAllPlayersLocations();
//
//        dungeonMinesOfIsengard.changeLocation(stepanius);
//        dungeonMinesOfIsengard.changeLocation(kostyanius);
//        dungeonMinesOfIsengard.changeLocation(mariania);
//        cityShire.changeLocation(elenaria);
//        cityShire.changeLocation(alexandruis);
//        cityShire.changeLocation(maximus);
//
//        printAllPlayersLocations();
//
//
//        dungeonMinesOfIsengard.heroesStartFightingBoss();





        Duel duel = new Duel(stepanius, kostyanius);

        duel.setDelegate(new Duel.Delegate() {
            @Override
            public Duel.Action getHeroActionForMove(Hero hero) {
                while (true) {
                    int moveNumber = scanner.requestInt("Make your move " + hero.getName() + "! 1 - attack, 2 - block, 9 - surrender");
                    if (moveNumber == 1) {
                        return Duel.Action.ATTACK;
                    } else if (moveNumber == 2) {
                        return Duel.Action.BLOCK;
                    } else if (moveNumber == 9) {
                        return Duel.Action.SURRENDER;
                    } else {
                        System.out.println("Please enter valid move number, " + hero.getName() + "!");
                    }
                }
            }

            @Override
            public void onMoveResult(String result) {
                System.out.println(result);
            }

            @Override
            public void onEnd(Hero winner, Hero loser, Duel.Result result) {
                String resultString = "Duel finished! ";
                if (result == Duel.Result.VICTORY) {
                    resultString += winner.getName() + " defeated " + loser.getName() + "!";
                } else if (result == Duel.Result.DRAW) {
                    resultString += "Both heroes are dead. It's a draw!";
                } else if (result == Duel.Result.SURRENDER){
                    resultString += loser.getName() + " surrendered! " + winner.getName() + " won the duel!";
                }
                System.out.println("\n\n" + resultString);
            }
        });

        duel.start();










    }

    private void printAllHeroesHealth() {
        for (int i = 0; i < players.size(); i++) {
            Hero hero = players.get(i).getHero();
            System.out.println(hero.getName() + " has " + hero.getHealth().getCurrentHealth() + " health");
        }
    }

    private Hero getHeroByName(String name) {
        for (int i = 0; i < players.size(); i++) {
            Hero hero = players.get(i).getHero();
            if (hero.getName().equals(name)) {
                return hero;
            }
        }
        return null;
    }

    private void printAllPlayersLocations() {
        for (int i = 0; i < players.size(); i++) {
            Hero hero = players.get(i).getHero();
            String currentLocationName = hero.getCurrentLocation().getName();
            System.out.println("Hero " + hero.getName() + " is in " + currentLocationName);
        }
    }

}
