package test23designmode.结构型模式.装饰模式;

/**
 * Title:
 * Date: 2019/1/31
 *
 * @author liujinlei
 * @version 1.0
 */
public class Lemon extends Condiment {
    private Beverage bevarage;
    // 这里很关键，需要传入具体的饮料，如需要传入没有被装饰的红茶或绿茶，
    // 当然也可以传入已经装饰好的芒果绿茶，这样可以做芒果柠檬绿茶
    public Lemon(Beverage bevarage) {
        this.bevarage = bevarage;
    }
    public String getDescription() {
        // 装饰
        System.out.println(bevarage.getDescription() + ", 加柠檬");
        return bevarage.getDescription() + ", 加柠檬";
    }
    public double cost() {
        // 装饰
        return bevarage.cost() + 2; // 加柠檬需要 2 元
    }
}

