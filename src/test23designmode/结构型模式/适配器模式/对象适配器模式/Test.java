package test23designmode.结构型模式.适配器模式.对象适配器模式;

/**
 * Title:
 * Description:
 *
 * @author liujinlei
 * @version 1.0
 */
public class Test {
    public static void main(String args[]){
        ChickMoudel c = new ChickMoudel();
        ChickAdapter ca =new ChickAdapter(c);
        ca.gagajiao();
        ca.fly();
    }
}
