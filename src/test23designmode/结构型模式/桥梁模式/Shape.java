package test23designmode.结构型模式.桥梁模式;

/**
 * Title:
 * Date: 2019/1/29
 *
 * @author liujinlei
 * @version 1.0
 */
public abstract class Shape {
    protected DrawAPI drawAPI;

    protected Shape(DrawAPI drawAPI){
        this.drawAPI = drawAPI;
    }
    public abstract void draw();
}