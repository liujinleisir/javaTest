package test面试.testclassloader;

import test面试.testclassloader.model.Derived;

/**
 * Title:
 * Date: 2019/2/12
 *
 * @author liujinlei
 * @version 1.0
 */
public class Test {
    @org.junit.Test
    public void test(){
        //进入Derived 构造函数。
        //Derived 成员变量的内存被分配。
        //Base 构造函数被隐含调用。
        //Base 构造函数调用preProcess()。
        //Derived 的preProcess 设置whenAmISet 值为 “set in preProcess()”。
        //Derived 的成员变量初始化被调用。
        //执行Derived 构造函数体。
        Derived d = new Derived();
        System.out.println( d.whenAmISet );
    }
}
