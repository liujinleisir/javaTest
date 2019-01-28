package test23designmode.创建型模式.工厂模式;


import test23designmode.创建型模式.model.Food;

/**
 * Title:
 * Description:要点
 * 1.是简单工厂的升级版：多个工厂
 * 2.多个工厂实现同一个接口，重写makeFood方法
 * 3.没有 3 ，剩下的和简单工厂一样
 *
 * @author liujinlei
 * @version 1.0
 */
public class Test {
    public static void main(String args []){
        // 先选择一个具体的工厂
        AmericanFoodFactory factory = new AmericanFoodFactory();
        // 由第一步的工厂产生具体的对象，不同的工厂造出不一样的对象
        Food food  =  factory.makeFood("B");
        System.out.println(food.getClass().getName());
    }
}
