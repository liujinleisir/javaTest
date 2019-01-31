package test23designmode.行为型模式.策略模式;

/**
 * Title:
 * Date: 2019/1/31
 *
 * @author liujinlei
 * @version 1.0
 */
public class GreenPen implements Strategy {
    @Override
    public void draw(int radius, int x, int y) {
        System.out.println("用绿色笔画图，radius:" + radius + ", x:" + x + ", y:" + y);
    }
}

