package test23designmode.创建型模式.单例模式.静态内部类;

import java.util.Date;

/**
 * Title:
 * Description:
 *
 * @author liujinlei
 * @version 1.0
 */
public class Singleton {
    private Singleton(){System.out.println("测试");}
    private static class Holder{
        private static Singleton singleton = new Singleton();
    }
    public static Singleton getinstance(){
        return Holder.singleton;
    }
    public static Date getDate() {return new Date();}
}
