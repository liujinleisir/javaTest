package test23designmode.行为型模式.观察者模式;

import java.util.ArrayList;
import java.util.List;

/**
 * Title:
 * Date: 2019/1/31
 *
 * @author liujinlei
 * @version 1.0
 */
public class Subject {

    private List<Observer> observers = new ArrayList<Observer>();
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        // 数据已变更，通知观察者们
        notifyAllObservers();
    }

    public void attach(Observer observer){
        observers.add(observer);
    }

    // 通知观察者们
    public void notifyAllObservers(){
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
