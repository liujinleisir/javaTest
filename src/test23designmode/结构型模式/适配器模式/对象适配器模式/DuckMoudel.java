package test23designmode.结构型模式.适配器模式.对象适配器模式;

/**
 * Title:
 * Description:
 *
 * @author liujinlei
 * @version 1.0
 */
public class DuckMoudel implements Duck {
    @Override
    public void gagajiao() {
        System.out.println("呱呱叫");

    }

    @Override
    public void fly() {
        System.out.println("鸭飞");
    }
}
