package test23designmode.行为型模式.策略模式.killifandelse;

import java.util.Map;

/**
 * Title:
 * Date: 2019/2/13
 *
 * @author liujinlei
 * @version 1.0
 */
public class ExcuteA implements ExcuteInterface {

    @Override
    public void doSomething(Map map) {
        System.out.println("do A .... a=1的逻辑");
    }
}
