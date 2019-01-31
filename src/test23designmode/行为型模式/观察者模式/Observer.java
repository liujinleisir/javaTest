package test23designmode.行为型模式.观察者模式;

/**
 * Title:
 * Date: 2019/1/31
 *
 * @author liujinlei
 * @version 1.0
 */
public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
