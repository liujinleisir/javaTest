package test23designmode.行为型模式.责任链模式;

/**
 * Title:
 * Date: 2019/2/2
 *
 * @author liujinlei
 * @version 1.0
 */
public class Context {
    private boolean newUser;

    public boolean isNewUser() {
        return newUser;
    }

    public void setNewUser(boolean newUser) {
        this.newUser = newUser;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    private String location;

}
