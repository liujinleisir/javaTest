package test23designmode.行为型模式.模板方法模式;

/**
 * Title:
 * Date: 2019/2/1
 *
 * @author liujinlei
 * @version 1.0
 */
public class Test {
    public static void main(String[] args) {
        AbstractTemplate t = new ConcreteTemplate();
        // 调用模板方法
        t.templateMethod();
    }
}
