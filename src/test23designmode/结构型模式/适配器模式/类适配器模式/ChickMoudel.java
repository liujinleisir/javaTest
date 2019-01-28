package test23designmode.结构型模式.适配器模式.类适配器模式;

/**
 * Title:
 * Description:
 *
 * @author liujinlei
 * @version 1.0
 */
public class ChickMoudel implements Chick {
    @Override
    public void gugu() {
        System.out.println("咕咕叫");
    }

    @Override
    public void fly() {
        System.out.println("鸡飞");
    }
}
