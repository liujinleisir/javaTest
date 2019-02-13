package test23designmode.行为型模式.策略模式.killifandelse;

import java.util.HashMap;
import java.util.Map;

/**
 * Title:
 * Date: 2019/2/13
 *
 * @author liujinlei
 * @version 1.0
 */
public class Test {
    public static void main(String[] args){
        try{
            Test.test(1);
            Test.test(2);
            Test.test(3);

        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void test(Integer value) throws Exception{
        ExcuteAdapter adapter = new ExcuteAdapter();
        ExcuteInterface ee =  adapter.incokeMehtod(value);
        ee.doSomething(new HashMap());
    }
}
