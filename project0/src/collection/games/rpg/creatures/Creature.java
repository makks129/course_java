package collection.games.rpg.creatures;

import collection.games.rpg.locations.Location;

// TODO Abs
public class Creature {

    protected String name;
    protected int level;
    protected int experienceOnLevel;
    protected int health;
    protected int strength;
    protected int intelligence;
    protected int agility;
    protected Location currentLocation;


    protected Creature(String name, int strength, int intelligence, int agility) {
        this.name = name;
        this.strength = strength;
        this.intelligence = intelligence;
        this.agility = agility;
        level = 1;
        experienceOnLevel = 0;
        health = 1000;
        double healthCoefficient = getHealthCoefficient();
        health = (int) (health * healthCoefficient);
    }

    public double getHealthCoefficient() {
        return -1;
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

    public int attack() {
        return 0;
    }

    public void takeAttack(int attack) {
        health -= attack;
    }

    public boolean isAlive() {
        return health > 0;
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

    public Location getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(Location currentLocation) {
        this.currentLocation = currentLocation;
    }
}
