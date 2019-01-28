package test23designmode.创建型模式.抽象工厂模式;

import test23designmode.创建型模式.model.AMDCPU;
import test23designmode.创建型模式.model.CPU;

/**
 * Title:
 * Description:
 *
 * @author liujinlei
 * @version 1.0
 */
public class AMDCPUFactory implements CPUFactory {
    @Override
    public CPU makeCPU() {
        return new AMDCPU();
    }
}
