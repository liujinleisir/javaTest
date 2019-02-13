package test23designmode.行为型模式.策略模式.killifandelse;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * Title:
 * Date: 2019/2/13
 *
 * @author liujinlei
 * @version 1.0
 */
public class ExcuteAdapter {
    Map map = new HashMap();

    public ExcuteAdapter(){
        map.put(1,"adapterA");
        map.put(2,"adapterB");
        map.put(3,"adapterElse");
    }

    public  ExcuteInterface adapterA(){
        return new ExcuteA();
    }
    public  ExcuteInterface adapterB(){
        return new ExcuteB();
    }
    public  ExcuteInterface adapterElse(){
        return new ExcuteElse();
    }

    public ExcuteInterface incokeMehtod(int value) throws Exception {
        ExcuteInterface ee = null;
        if(this.map.containsKey(value)){
            Class clzz = this.getClass();
            try {
                Method m = clzz.getMethod(this.map.get(value).toString());
                ee = (ExcuteInterface)m.invoke(this);
            } catch (Exception e) {
                e.printStackTrace();
                throw new Exception("出错了!");
            }
        }else{
            throw new Exception("无效的值");
        }
        return ee;
    }
}
