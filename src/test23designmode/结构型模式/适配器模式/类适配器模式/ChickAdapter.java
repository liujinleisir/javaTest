package test23designmode.结构型模式.适配器模式.类适配器模式;

import test23designmode.结构型模式.适配器模式.对象适配器模式.ChickMoudel;
import test23designmode.结构型模式.适配器模式.对象适配器模式.Duck;

/**
 * Title:
 * Description:
 *
 * @author liujinlei
 * @version 1.0
 */
public class ChickAdapter extends ChickMoudel implements Duck {
    @Override
    public void gagajiao() {
        super.gugu();
    }

    @Override
    public void fly() {
        super.fly();
    }
}
