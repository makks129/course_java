package collection.games.rpg.items;

public class Wallet {

    private Money money;

    public Wallet() {
        money = new Money(0, 0, 0);
    }

    public Money getMoney() {
        return money;
    }

    public void setMoney(Money money) {
        this.money = money;
    }
}
