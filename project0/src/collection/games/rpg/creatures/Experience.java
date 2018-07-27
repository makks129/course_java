package collection.games.rpg.creatures;

public class Experience {

    private static final int MAX_LEVEL = 60;
    private static final int EXPERIENCE_TO_NEXT_LEVEL = 1000;

    private Creature creature;
    private int level;
    private int experienceOnLevel;

    public Experience(Creature creature) {
        this.creature = creature;
        level = 1;
        experienceOnLevel = 0;
    }

    /**
     * Add experience and gain a level up
     *
     * @param exp amount of experience gained
     * @return whether creature gained a level up
     */
    public boolean gainExperience(int exp) {
        experienceOnLevel += exp;
        if (experienceOnLevel >= EXPERIENCE_TO_NEXT_LEVEL) {
            if (level < MAX_LEVEL) {
                levelUp();
                return true;
            } else {
                experienceOnLevel = 0;
            }
        }
        return false;
    }

    private void levelUp() {
        level++;
        experienceOnLevel -= EXPERIENCE_TO_NEXT_LEVEL;
        creature.hp.maxHealth += 100;
        creature.strength += 3;
        creature.intelligence += 3;
        creature.agility += 3;
    }

    public int getLevel() {
        return level;
    }

    public int getExperienceOnLevel() {
        return experienceOnLevel;
    }

}
