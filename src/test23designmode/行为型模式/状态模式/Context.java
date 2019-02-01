package test23designmode.行为型模式.状态模式;

/**
 * Title:
 * Date: 2019/2/1
 *
 * @author liujinlei
 * @version 1.0
 */
public class Context {
    private State state;
    private String name;
    public Context(String name) {
        this.name = name;
    }

    public void setState(State state) {
        this.state = state;
    }
    public State getState() {
        return this.state;
    }
}
