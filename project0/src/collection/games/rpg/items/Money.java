package collection.games.rpg.items;

public class Money {

    private static final int BRONZE_IN_SILVER = 100;
    private static final int SILVER_IN_GOLD = 100;
    public static final Money ZERO = new Money(0, 0, 0);

    private final int gold;
    private final int silver;
    private final int bronze;

    public Money(int gold, int silver, int bronze) {
        // Converts g,s,b into maximum values: g doesn't have a limit, s can be max 99, b can be max 99
        int silverInBronzeValue = bronze / BRONZE_IN_SILVER;
        this.bronze = bronze % BRONZE_IN_SILVER;
        silver += silverInBronzeValue;
        int goldInSilverValue = silver / SILVER_IN_GOLD;
        this.silver = silver % SILVER_IN_GOLD;
        this.gold = gold + goldInSilverValue;
    }

    public Money add(Money money) {
        return new Money(gold + money.gold,
                silver + money.silver,
                bronze + money.bronze);
    }

    // TODO write method to subtract money
    // Examples:
    // (50g,50s,50b) - (20g,20s,20b) = (30g,30s,30b)
    // (1g,0s,0b) - (0g,99s,99b) = (0g,0s,1b)
    // (50g,50s,50b) - (100g,100s,100b) = null -- impossible to subtract

    public int getGold() {
        return gold;
    }

    public int getSilver() {
        return silver;
    }

    public int getBronze() {
        return bronze;
    }

    @Override
    public String toString() {
        return "(" + gold + "g, " + silver + "s, " + bronze + "b)";
    }
}
