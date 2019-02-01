package test23designmode.行为型模式.状态模式;

/**
 * Title:
 * Date: 2019/2/1
 *
 * @author liujinlei
 * @version 1.0
 */
public class RevertState implements State {
    public void doAction(Context context) {
        System.out.println("给此商品补库存");
        context.setState(this);

        //... 执行加库存的具体操作
    }
    public String toString() {
        return "Revert State";
    }
}
