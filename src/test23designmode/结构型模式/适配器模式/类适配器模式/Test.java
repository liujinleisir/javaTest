package test23designmode.结构型模式.适配器模式.类适配器模式;

/**
 * Title:
 * Description:
 *
 * @author liujinlei
 * @version 1.0
 */
public class Test {
    public static void main(String args[]){
        ChickAdapter ca = new ChickAdapter();
        ca.fly();
        ca.gagajiao();
    }
}
