package test23designmode.创建型模式.单例模式.静态内部类;


/**
 * Title:
 * Description: 要点
 * 优点：
 * 1.线程安全
 * 2.可替代懒汉模式
 *
 * @author liujinlei
 * @version 1.0
 */
public class Test {
    public static void main(String[] args) {
        //1.测试类加载是否实例化
        Singleton.getDate();
        Singleton s = Singleton.getinstance();
        System.out.println(s);
    }

}
