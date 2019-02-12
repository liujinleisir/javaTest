package test面试.testclassloader.model;

/**
  * 创建人： liujinlei
  * 创建时间：2019/2/12
  * 创建目的：【】
  */
public class Derived extends Base {
    public String whenAmISet = "set when declared";
    public Derived(){
        //super();
        System.out.println("子类构造调用开始");
        System.out.println("此时whenAmISet = " + whenAmISet);
        System.out.println("子类构造调用结束");
    }
    @Override
    void preProcess()
    {
        System.out.println("子类调用preProcess开始");
        whenAmISet = "set in preProcess";
        System.out.println("此时whenAmISet = " + whenAmISet);
        System.out.println("子类调用preProcess结束");
    }
}