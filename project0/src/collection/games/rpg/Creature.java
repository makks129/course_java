package collection.games.rpg;

public class Creature {

    protected String name;
    protected int level;
    protected int experienceOnLevel;
    protected int health;
    protected int strength;
    protected int intelligence;
    protected int agility;

    public Creature(String name, int health, int strength, int intelligence, int agility) {
        this.name = name;
        this.health = health;
        this.strength = strength;
        this.intelligence = intelligence;
        this.agility = agility;
        level = 1;
        experienceOnLevel = 0;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public int getExperienceOnLevel() {
        return experienceOnLevel;
    }

    public int getHealth() {
        return health;
    }

    public int getStrength() {
        return strength;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getAgility() {
        return agility;
    }

    protected void setName(String name) {
        this.name = name;
    }
}
