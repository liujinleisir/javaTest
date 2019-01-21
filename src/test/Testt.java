package test;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.*;

import org.junit.Test;

public class Testt {
    public static void main(String[] args) {
//        Date date = new Date();
//        SimpleDateFormat sdf =new SimpleDateFormat("yyyyMMdd");
//       System.out.println(sdf.format(date)); ;
//       Test t = new Test();
//        t.test(new ArrayList());
    }

    public void test(List list) {
        Map<String, List> map = new HashMap();
        map.put("qqq", list);
        boolean aa = test1(map);
        int i = 1;
    }

    public boolean test1(Map<String, List> map) {
        List list = map.get("qqq");
        list.add("www");
        String aaa = null;
        try {
            aaa.length();
        } catch (Exception e) {
            throw e;
        }
        return true;
    }

    @Test
    public void test1() {
        Integer planId = 1032;
        String applyName = "";
        if (1030 == planId) {
            applyName = "51信用卡";
        } else if (1032 == planId) {
            applyName = "有利滨海";
        } else if (1041 == planId) {
            applyName = "51滨海";
        }
        System.out.println(applyName);
    }

    @Test
    public void test() {
        Integer dateNowInt = Integer.valueOf(new SimpleDateFormat("yyyyMMdd").format(new Date()));
        int num = 0;//遍历次数
        fff:
        for (Integer i = dateNowInt + 1; ; i++) {
            num++;
            String aaa = i + "";
            char[] bbb = aaa.toCharArray();
            //去除重复部分优化
            Set<Character> set = new HashSet<>();
            for (int j = 0; j < bbb.length; j++) {
                set.add(bbb[j]);
            }
            if (set.size() < 8) {
                //说明有重复
                continue;
            }
            //去除不是日期格式
            try {
                SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
                sdf.setLenient(false);
                Date ggg = sdf.parse(aaa);
                System.out.println(bbb);
                System.out.println("遍历次数：" + num);
                break;
            } catch (Exception e) {
                continue;
            }
        }
    }
}
