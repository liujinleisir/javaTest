package test23designmode.行为型模式.责任链模式;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Title:
 * Date: 2019/2/2
 *
 * @author liujinlei
 * @version 1.0
 */
public class ActivityService {
    String [] locations = new String[]{"三里屯","东大桥","朝阳门","西单"};
    public boolean isSupportedLocation(String location) {
        List<String> locationList = Arrays.asList(locations);
        if(locationList.contains(location)){
            return true;
        }else{
            return false;
        }
    }

    public int hasGiftNums() {
        return 1;
    }
}
