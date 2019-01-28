package test23designmode.创建型模式.简单工厂模式;


import test23designmode.创建型模式.model.Food;

/**
 * Title:
 * Description:要点：
 * 1.就是将new 对象的操作 托管到Factory
 *
 * @author liujinlei
 * @version 1.0
 */
public class Test {
    public static void main(String args []){
        Food food  =  a_FoodFactory.makeFood("noodle");
        System.out.println(food.getClass().getName());
    }
}
