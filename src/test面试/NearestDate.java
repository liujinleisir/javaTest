package test面试;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.*;

import org.junit.Test;

public class NearestDate {

    @Test
    public void test() {
        String date = new SimpleDateFormat("yyyyMMdd").format(new Date());
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

    @Test
    public void test2() {
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        int num = 0;//遍历次数
        flag:
        while (true) {
            num++;
            calendar.add(Calendar.DATE, 1);
            String dateStr = sdf.format(calendar.getTime());
            //当前日期往后数第i天的日期
            Integer dateInt = Integer.valueOf(dateStr);
            //去重
            char[] dateArray = dateInt.toString().toCharArray();
            Set<Character> set = new HashSet<>();
            for (int j = 0; j < dateArray.length; j++) {
                set.add(dateArray[j]);
            }
            if (set.size() != 8) {
                //说明有重复
                continue;
            } else {
                System.out.println(dateInt.toString());
                System.out.println("遍历次数：" + num);
                break flag;
            }
        }
    }
}
