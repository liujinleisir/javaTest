package test23designmode.创建型模式.建造者模式;

/**
 * Title:
 * Description: 怎么评价这个模式呢？
 *
 * 假如你想要一个符合你要求的对象，我们可以采取建造者模式，里边在赋值的同时  还可以进行有效性检验等业务逻辑
 * 当然，如果你只是想要链式写法，不想要建造者模式，有个很简单的办法，User 的 getter 方法不变，所有的 setter 方法都让其 return this 就可以了，然后就可以像下面这样调用
 *
 * @author liujinlei
 * @version 1.0
 */
public class Test {
    public static void main(String[] args) {
        User d = User.builder()
                .name("foo")
                .password("pAss12345")
                .age(25)
                .build();
        int A = 1;
    }
}
