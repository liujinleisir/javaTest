package test23designmode.结构型模式.代理模式.静态代理;

/**
 * Title:
 * Description:
 *
 * @author liujinlei
 * @version 1.0
 */
public class Test {
    public static void main(String args[]){
        DoSomeThingService ds  =  new DoSomeThingServiceProxy();
        ds.someThing();
    }
}
