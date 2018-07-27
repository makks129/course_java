package collection.games.rpg.creatures;

public class Health {

    private static final int DEFAULT_MAX_HEALTH = 1000;

    protected int maxHealth;
    protected int currentHealth;

    public Health(double healthCoefficient) {
        maxHealth = DEFAULT_MAX_HEALTH;
        increaseMaxHealthByCoefficient(healthCoefficient);
        currentHealth = maxHealth;
    }

    public void increaseMaxHealthByCoefficient(double coefficient) {
        maxHealth = (int) (maxHealth * coefficient);
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public int getCurrentHealth() {
        return currentHealth;
    }

    public void takeDamage(int dmgAmount) {
        currentHealth -= dmgAmount;
        if (currentHealth < 0) {
            currentHealth = 0;
        }
    }

    public void getHealed(int healAmount) {
        currentHealth += healAmount;
        if (currentHealth > maxHealth) {
            currentHealth = maxHealth;
        }
    }

    public boolean isAlive() {
        return currentHealth > 0;
    }

    public boolean isDead() {
        return !isAlive();
    }

}
