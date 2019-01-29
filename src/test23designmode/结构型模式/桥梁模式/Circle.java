package test23designmode.结构型模式.桥梁模式;

/**
 * Title:
 * Date: 2019/1/29
 *
 * @author liujinlei
 * @version 1.0
 */
public class Circle extends Shape {
    private int x, y, radius;

    public Circle(int x, int y, int radius, DrawAPI drawAPI) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public void draw() {
        drawAPI.drawCircle(radius,x,y);
    }
}
