package test23designmode.行为型模式.责任链模式;

/**
 * Title:
 * Date: 2019/2/1
 *
 * @author liujinlei
 * @version 1.0
 */
public class Test {
    //注：此demo的流程配置在main方法，时间还可优化
    //正常的流程一般是很少变的，流程可配置到类中
    //稍微动脑筋还可以写一个流程配置的util类
    public static void main(String[] args) {
        Context context = new Context();
        context.setNewUser(true);
        context.setLocation("三里屯");
        RuleHandler newUserHandler = new NewUserRuleHandler();
        RuleHandler locationHandler = new LocationRuleHandler();
        RuleHandler limitHandler = new LimitRuleHandler();

        // 假设本次活动仅校验地区和奖品数量，不校验新老用户
        locationHandler.setSuccessor(limitHandler);
        locationHandler.apply(context);
    }
}
