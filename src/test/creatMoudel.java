package test;

import jdk.nashorn.internal.parser.JSONParser;
import org.junit.Test;

import java.lang.reflect.Method;
import java.math.BigInteger;
import java.util.*;

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
//        Class clazz = AAA.class;
//        Method[] methods =  clazz.getMethods();
//        StringBuffer sb = new StringBuffer();
//        for (Method method: methods) {
//           String name = method.getName();
//           if(name.startsWith("set")){
//               sb.append("obj1."+name+"(obj2.get"+name.substring(3,name.length())+"());"+"\n");
//           }
//        }
//        System.out.println(sb);
//
//        String [] cityCodeArray = "41243".split(",");
//        System.out.println(cityCodeArray.toString());

//        List<String> listOrgin = Arrays.asList("0","1","2","3","4","5","6","7","8","9","10");
//        int size = listOrgin.size();
//        List<Map<String, List<String>>> listResult = new ArrayList<>();
//        for(int i = 0 ;i < size-3; i+=3){
//            List<String> customer = listOrgin.subList(i,i+3);
//            Map<String,List<String>> mapRes = new HashMap<>();
//            mapRes.put(1+"sS",customer);
//            listResult.add(mapRes);
//        }
//
//        int  s = size % 3;
//        List<String> customer = listOrgin.subList(listOrgin.size() - 3+s,listOrgin.size());
//        Map<String,List<String>> mapRes = new HashMap<>();
//        mapRes.put("SupersS",customer);
//        listResult.add(mapRes);
//
//        System.out.println(listResult);

        String aaa = "DH0000000001,30.0";
        String[] args = aaa.split(",");
        System.out.println(args.length);
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i] + ">>>>>>>");
        }


        boolean flag = true;
        String aaa1 = "fsad";

        if(flag){
            //失效时间(校验)
            if (true) {
                if(aaa1.startsWith("津")){
                    flag = false;
                }else{
                    flag = true;

                    flag = false;

                }
            }else{
                flag = false;
            }
        }

        System.out.println(flag);

    }
}
