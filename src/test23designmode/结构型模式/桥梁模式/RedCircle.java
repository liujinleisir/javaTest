package test23designmode.结构型模式.桥梁模式;

/**
 * Title:
 * Date: 2019/1/29
 *
 * @author liujinlei
 * @version 1.0
 */
public class RedCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: red, radius: " + radius + ", x: " + x + ", " + y + "]");
    }
}