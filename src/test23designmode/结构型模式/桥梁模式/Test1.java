package test23designmode.结构型模式.桥梁模式;

/**
 * Title:
 * Date: 2019/1/29
 *
 * @author liujinlei
 * @version 1.0
 */
public class Test1 {
    public static void main(String[] args) {
        Shape redCircle = new Circle(100,100, 10, new RedCircle());
        Shape greenCircle = new Circle(100,100, 10, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }
}
