package test23designmode.行为型模式.策略模式;

/**
 * Title:
 * Date: 2019/1/31
 *
 * @author liujinlei
 * @version 1.0
 */
public class Test {
    public static void main(String[] args) {
        Context context = new Context(new BluePen()); // 使用绿色笔来画
        context.executeDraw(10, 0, 0);
    }
}
