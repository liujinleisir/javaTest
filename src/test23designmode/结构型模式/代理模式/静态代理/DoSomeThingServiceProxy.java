package test23designmode.结构型模式.代理模式.静态代理;

/**
 * Title:
 * Description:
 *
 * @author liujinlei
 * @version 1.0
 */
public class DoSomeThingServiceProxy implements DoSomeThingService {
    @Override
    public void someThing() {
        DoSomeThingService ds = new DoSomeThingServiceImpl();
        System.out.println("代理：开始吧");
        ds.someThing();
        System.out.println("代理：这头猪表演完毕");
    }
}
