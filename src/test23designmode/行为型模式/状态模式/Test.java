package test23designmode.行为型模式.状态模式;

import java.util.Random;

/**
 * Title:
 * Date: 2019/2/1
 *
 * @author liujinlei
 * @version 1.0
 */
public class Test {
    public static void main(String[] args) {
        int remainedTimes = new Random().nextInt(3); // 查询剩余奖品
        System.out.println(remainedTimes);

        // 我们需要操作的是 iPhone X
        Context context = new Context("iPhone X");

        // 看看怎么进行补库存操作
        State revertState = new RevertState();
        revertState.doAction(context);
        System.out.println(context.getState().toString());

        // 同样的，减库存操作也非常简单
        State deductState = new DeductState();
        deductState.doAction(context);

        // 如果需要我们可以获取当前的状态
        System.out.println(context.getState().toString());
    }
}
