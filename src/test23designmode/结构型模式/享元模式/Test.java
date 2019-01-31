package test23designmode.结构型模式.享元模式;

import test23designmode.结构型模式.装饰模式.Beverage;
import test23designmode.结构型模式.装饰模式.GreenTea;
import test23designmode.结构型模式.装饰模式.Lemon;
import test23designmode.结构型模式.装饰模式.Mango;

import java.util.Map;

/**
 * Title:
 * Date: 2019/1/31
 *
 * @author liujinlei
 * @version 1.0
 */
public class Test {
    public static void main(String[] args) {
        //英文是 Flyweight Pattern，不知道是谁最先翻译的这个词，感觉这翻译真的不好理解，
        // 我们试着强行关联起来吧。Flyweight 是轻量级的意思，享元分开来说就是 共享 元器件，
        // 也就是复用已经生成的对象，这种做法当然也就是轻量级的了。复用对象最简单的方式是，
        // 用一个 HashMap 来存放每次新生成的对象。每次需要一个对象的时候，先到 HashMap 中看看有没有，
        // 如果没有，再生成新的对象，然后将这个对象放入 HashMap 中。


    }

}
