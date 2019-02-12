package test面试.testclassloader.model;

/**
 * Title:
 * Date: 2019/2/12
 *
 * @author liujinlei
 * @version 1.0
 */
public class Base {
    Base() {
        System.out.println("父类构造调用开始");
        preProcess();
        System.out.println("父类构造调用结束");
    }
    void preProcess() {
        System.out.println("父类调用preProcess开始");
    }
}
