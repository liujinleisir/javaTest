package test23designmode.结构型模式.装饰模式;

/**
 * Title:
 * Date: 2019/1/31
 *
 * @author liujinlei
 * @version 1.0
 */
public class BlackTea extends Beverage {
    public String getDescription() {
        return "红茶";
    }
    public double cost() {
        return 11;
    }
}
