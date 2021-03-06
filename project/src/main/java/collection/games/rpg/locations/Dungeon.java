package collection.games.rpg.locations;

import collection.games.rpg.creatures.heros.Hero;
import collection.games.rpg.creatures.mosters.Boss;
import collection.games.rpg.creatures.mosters.Monster;

import java.util.List;

public class Dungeon extends Location {

    protected List<Monster> monsters;
    protected Boss boss;

    public Dungeon(String name, List<Monster> monsters, Boss boss) {
        super(name);
        this.monsters = monsters;
        this.boss = boss;
    }

    public void heroesStartFightingBoss() {
        for (int i = 0; i < heroes.size(); i++) {
            Hero hero = heroes.get(i);
            if (hero == null) {
                continue; // if this space is not occupied by a hero (it is null), then run next loop cycle
            }

            // here hero is not null!
            // TODO add check if all heroes are alive or the group is defeated!

            // if hero is alive he attacks
            if (hero.getHealth().isAlive()) {
                int heroAttack = hero.attack();
                boss.getHealth().takeDamage(heroAttack);
            } else {
                System.out.println("Hero " + hero.getName() + " is defeated!");
            }

            // if boss is alive he attacks
            if (boss.getHealth().isAlive()) {
                int bossAttack = boss.attack();
                hero.getHealth().takeDamage(bossAttack);
            } else {
                System.out.println(boss.getName() + " is defeated!");
                return;
            }

        }
    }

}
