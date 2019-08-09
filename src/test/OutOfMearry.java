package test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: jinlei.liu
 * @create: 2019/8/7 9:59
 * @email: jinlei.liu@oneecar.com
 */
public strictfp class OutOfMearry {
    public static void main(String args []){

        BigDecimal a1 = new BigDecimal("1.2").subtract(new BigDecimal("1"));
        BigDecimal b1 = new BigDecimal("0.2");
        System.out.println(a1.compareTo(b1));
        BigDecimal a2 = new BigDecimal(1.2).subtract(new BigDecimal(1));
        BigDecimal b2 = new BigDecimal(0.2);
        //
        System.out.println(a2.compareTo(b2));

    }
}
