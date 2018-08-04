package collection.games.rpg.items;

public class Wallet {

    private Money money;

    public Wallet() {
        money = Money.ZERO;
    }

    public Money getMoney() {
        return money;
    }

    public void setMoney(Money money) {
        this.money = money;
    }

    public void addMoney(Money money) {
        this.money = this.money.add(money);
    }

}
