package test23designmode.创建型模式.简单工厂模式;

import test23designmode.创建型模式.model.Food;
import test23designmode.创建型模式.model.HuangMenChicken;
import test23designmode.创建型模式.model.LanZhouNoodle;

/**
 * Title: 简单工厂模式
 * Description:
 *
 * @author liujinlei
 * @version 1.0
 */
public class a_FoodFactory {

    public static Food makeFood(String name) {
        if (name.equals("noodle")) {
            Food noodle = new LanZhouNoodle();
            noodle.addSpicy("more");
            return noodle;
        } else if (name.equals("chicken")) {
            Food chicken = new HuangMenChicken();
            chicken.addCondiment("potato");
            return chicken;
        } else {
            return null;
        }
    }
    public static void main(String args []){
        Food food  =  a_FoodFactory.makeFood("noodle");
    }
}

