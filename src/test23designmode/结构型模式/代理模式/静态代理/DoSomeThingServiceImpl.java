package test23designmode.结构型模式.代理模式.静态代理;

/**
 * Title:
 * Description:
 *
 * @author liujinlei
 * @version 1.0
 */
public class DoSomeThingServiceImpl implements DoSomeThingService {
    @Override
    public void someThing() {
        System.out.println("表演者：我要开始表演了!");
    }
}
