package test23designmode.结构型模式.适配器模式.对象适配器模式;

import test23designmode.创建型模式.工厂模式.ChineseFoodA;
import test23designmode.结构型模式.代理模式.DoSomeThingService;
import test23designmode.结构型模式.代理模式.DoSomeThingServiceProxy;

/**
 * Title:
 * Description:
 *
 * @author liujinlei
 * @version 1.0
 */
public class Test {
    public static void main(String args[]){
        ChickMoudel c = new ChickMoudel();
        ChickAdapter ca =new ChickAdapter(c);
        ca.gagajiao();
        ca.fly();
    }
}
