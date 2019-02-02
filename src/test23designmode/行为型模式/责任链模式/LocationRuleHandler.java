package test23designmode.行为型模式.责任链模式;

/**
 * Title:
 * Date: 2019/2/1
 *
 * @author liujinlei
 * @version 1.0
 */
public class LocationRuleHandler extends RuleHandler {
    public void apply(Context context) {
        ActivityService activityService =  new ActivityService();
        boolean allowed = activityService.isSupportedLocation(context.getLocation());
        if (allowed) {
            if (this.getSuccessor() != null) {
                this.getSuccessor().apply(context);
            }
        } else  {
            throw new RuntimeException("非常抱歉，您所在的地区无法参与本次活动");
        }
    }
}