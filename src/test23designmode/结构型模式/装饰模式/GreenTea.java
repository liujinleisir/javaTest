package test23designmode.结构型模式.装饰模式;

/**
 * Title:
 * Date: 2019/1/31
 *
 * @author liujinlei
 * @version 1.0
 */
public class GreenTea extends Beverage {
    public String getDescription() {
        System.out.println("绿茶");
        return "绿茶";
    }
    public double cost() {
        return 11;
    }
}
