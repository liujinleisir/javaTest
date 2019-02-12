package test;

import org.junit.Test;

import java.lang.reflect.Method;

/**
 * <p>Title: </p >
 * <p>Description: </p >
 * <p>Copyright: Copyright (c) 2019</p >
 *
 * @author liujinlei
 * @version 1.0
 * 修改记录：
 * 修改序号，修改日期，修改人，修改内容
 */
public class creatMoudel {
    @Test
    public void test() {
        Class clazz = AAA.class;
        Method[] methods =  clazz.getMethods();
        StringBuffer sb = new StringBuffer();
        for (Method method: methods) {
           String name = method.getName();
           if(name.startsWith("set")){
               sb.append("obj1."+name+"(obj2.get"+name.substring(3,name.length())+"());"+"\n");
           }
        }
        System.out.println(sb);
    }

}
