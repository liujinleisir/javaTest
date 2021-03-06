package test23designmode.行为型模式.模板方法模式;

/**
 * Title:
 * Date: 2019/2/1
 *
 * @author liujinlei
 * @version 1.0
 */
public abstract class AbstractTemplate {
    // 这就是模板方法
    public void templateMethod(){
        init();
        apply(); // 这个是重点
        end(); // 可以作为钩子方法
    }
    protected void init() {
        System.out.println("init 抽象层已经实现，子类也可以选择覆写");
    }
    // 留给子类实现
    protected abstract void apply();
    protected void end() {
    }
}

