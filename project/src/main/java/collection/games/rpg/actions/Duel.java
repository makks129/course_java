package collection.games.rpg.actions;

import collection.games.rpg.creatures.heros.Hero;

public class Duel {

    private Hero h1;
    private Hero h2;
    private Delegate delegate;

    public Duel(Hero h1, Hero h2) {
        this.h1 = h1;
        this.h2 = h2;
    }

    public void setDelegate(Delegate delegate) {
        this.delegate = delegate;
    }

    // TODO Change duel logic. Current version is very bad and boring :(
    public void start() {

        h1.getHealth().healToMaximum();
        h2.getHealth().healToMaximum();

        int h1AttackPowerModifier = 1;
        int h2AttackPowerModifier = 1;

        while (true) {

            Action h1Action = delegate.getHeroActionForMove(h1);
            Action h2Action = delegate.getHeroActionForMove(h2);

            if (checkForImmediateEnd(h1, h2, h1Action)) {
                break;
            }
            if (checkForImmediateEnd(h2, h1, h2Action)) {
                break;
            }

            String moveResult = "";

            int h1Attack = 0;
            if (h1Action == Action.ATTACK) {
                h1Attack = h1.attack() * Math.min(h1AttackPowerModifier, 3);
                h1AttackPowerModifier = 1;
                moveResult += h1.getName() + " attacks for " + h1Attack + "\n";
            } else if (h1Action == Action.BLOCK) {
                h1AttackPowerModifier++;
                moveResult += h1.getName() + " blocks\n";
            }

            int h2Attack = 0;
            if (h2Action == Action.ATTACK) {
                h2Attack = h2.attack() * Math.min(h2AttackPowerModifier, 3);
                h2AttackPowerModifier = 1;
                moveResult += h2.getName() + " attacks for " + h2Attack + "\n";
            } else if (h2Action == Action.BLOCK) {
                h2AttackPowerModifier++;
                moveResult += h2.getName() + " blocks\n";
            }

            if (h2Action != Action.BLOCK) {
                h2.getHealth().takeDamage(h1Attack);
            }
            if (h1Action != Action.BLOCK) {
                h1.getHealth().takeDamage(h2Attack);
            }

            moveResult += h1.getName() + " has " + h1.getHealth().toString() + " health\n";
            moveResult += h2.getName() + " has " + h2.getHealth().toString() + " health\n";
            delegate.onMoveResult(moveResult);

            if (checkForEnd(h1, h2)) {
                break;
            }
            if (checkForEnd(h2, h1)) {
                break;
            }

        }

    }

    private Action getHeroAction(Hero hero) {
        Action action;
        while (true) {
            action = delegate.getHeroActionForMove(hero);
            if (action != null) {
                return action;
            }
        }
    }

    private boolean checkForImmediateEnd(Hero first, Hero second, Action firstAction) {
        if (firstAction == Action.SURRENDER) {
            delegate.onEnd(second, first, Result.SURRENDER);
            return true;
        }
        return false;
    }

    private boolean checkForEnd(Hero first, Hero second) {
        if (first.getHealth().isDead()) {
            if (second.getHealth().isDead()) {
                delegate.onEnd(second, first, Result.DRAW);
            } else {
                delegate.onEnd(second, first, Result.VICTORY);
            }
            return true;
        }
        return false;
    }


    public enum Action {
        ATTACK, BLOCK, SURRENDER
    }

    public enum Result {
        VICTORY, DRAW, SURRENDER
    }

    public interface Delegate {
        Action getHeroActionForMove(Hero hero);
        void onMoveResult(String result);
        void onEnd(Hero winner, Hero loser, Result result);
    }

}
