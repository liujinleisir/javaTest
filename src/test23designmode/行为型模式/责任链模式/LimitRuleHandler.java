package test23designmode.行为型模式.责任链模式;

import java.util.Random;

/**
 * Title:
 * Date: 2019/2/1
 *
 * @author liujinlei
 * @version 1.0
 */
public class LimitRuleHandler extends RuleHandler {
    public void apply(Context context) {
        ActivityService activityService =  new ActivityService();
        int remainedTimes = activityService.hasGiftNums(); // 查询剩余奖品
        if (remainedTimes > 0) {
            if (this.getSuccessor() != null) {
                this.getSuccessor().apply(context);
            }
        } else {
            throw new RuntimeException("您来得太晚了，奖品被领完了");
        }
    }
}
