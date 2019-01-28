package test23designmode.创建型模式.单例模式.饿汉模式;

/**
 * Title:
 * Description: 要点
 * 优点：
 * 1.线程安全
 * 2.在类加载的同时已经创建好一个静态对象，调用时反应速度快
 * 缺点：资源效率不高，可能getInstance()永远不会执行到，但执行该类的其他静态方法或者加载了该类（class.forName)，那么这个实例仍然初始化
 *
 * @author liujinlei
 * @version 1.0
 */
public class Test {
    public static void main(String[] args) {
        //1.测试类加载是否实例化
        Singleton.getDate();
        //2.测试是否单例
        Singleton s =  Singleton.getInstance();
        Singleton s1 =  Singleton.getInstance();
        System.out.println(s);
        System.out.println(s1);
        Runnable r = ()->{
            Singleton s2 =  Singleton.getInstance();
            System.out.println(s2);

        };
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        r.run();
    }
}
