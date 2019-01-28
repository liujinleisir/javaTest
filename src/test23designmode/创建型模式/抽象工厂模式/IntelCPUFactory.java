package test23designmode.创建型模式.抽象工厂模式;

import test23designmode.创建型模式.model.CPU;
import test23designmode.创建型模式.model.IntelCPU;

/**
 * Title:
 * Description:
 *
 * @author liujinlei
 * @version 1.0
 */
public class IntelCPUFactory implements CPUFactory {
    @Override
    public CPU makeCPU() {
        return new IntelCPU();
    }
}
