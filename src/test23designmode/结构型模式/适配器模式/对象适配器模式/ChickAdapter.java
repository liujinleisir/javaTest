package test23designmode.结构型模式.适配器模式.对象适配器模式;

/**
 * Title:
 * Description:
 *
 * @author liujinlei
 * @version 1.0
 */
public class ChickAdapter implements Duck  {
    ChickMoudel chick;
    public ChickAdapter(ChickMoudel chick){
        this.chick = chick;
    }
    @Override
    public void gagajiao() {
        chick.gugu();
    }

    @Override
    public void fly() {
        chick.fly();
    }
}
