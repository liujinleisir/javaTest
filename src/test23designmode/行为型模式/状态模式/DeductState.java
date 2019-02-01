package test23designmode.行为型模式.状态模式;

/**
 * Title:
 * Date: 2019/2/1
 *
 * @author liujinlei
 * @version 1.0
 */
public class DeductState implements State {

    public void doAction(Context context) {
        System.out.println("商品卖出，准备减库存");
        context.setState(this);

        //... 执行减库存的具体操作
    }

    public String toString(){
        return "Deduct State";
    }
}
