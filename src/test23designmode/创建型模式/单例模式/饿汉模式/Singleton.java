package test23designmode.创建型模式.单例模式.饿汉模式;

import java.util.Date;

/**
 * Title: 饿汉模式
 * Description:
 *
 * @author liujinlei
 * @version 1.0
 */
public class Singleton {
    //1.私有化构造器，保证“外部”不能通过构造器 new
    private Singleton(){
        System.out.println("测试");
    }
    //2.全局变量为“内部”new的对象
    private static Singleton singleton =  new Singleton();
    //3.提供一个获取该对象公共方法,一定要静态
    public static Singleton getInstance(){
        return singleton;
    }
    // 瞎写一个静态方法。这里想说的是，如果我们只是要调用 Singleton.getDate(...)，
    // 本来是不想要生成 Singleton 实例的，不过没办法，已经生成了
    public static Date getDate() {return new Date();}


}
