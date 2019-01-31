package test23designmode.结构型模式.装饰模式;

/**
 * Title:
 * Date: 2019/1/31
 *
 * @author liujinlei
 * @version 1.0
 */
public class Mango extends Condiment {
    private Beverage bevarage;
    public Mango(Beverage bevarage) {
        this.bevarage = bevarage;
    }
    public String getDescription() {
        System.out.println(bevarage.getDescription() + ", 加芒果");

        return bevarage.getDescription() + ", 加芒果";
    }
    public double cost() {
        return bevarage.cost() + 3; // 加芒果需要 3 元
    }
}