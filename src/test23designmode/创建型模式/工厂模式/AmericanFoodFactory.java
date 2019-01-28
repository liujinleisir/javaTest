package test23designmode.创建型模式.工厂模式;

import test23designmode.创建型模式.model.Food;

/**
 * Title:
 * Description:
 *
 * @author liujinlei
 * @version 1.0
 */
public class AmericanFoodFactory implements b_FoodFactory {

    @Override
    public Food makeFood(String name) {
        if (name.equals("A")) {
            return new AmericanFoodA();
        } else if (name.equals("B")) {
            return new AmericanFoodB();
        } else {
            return null;
        }
    }
}
