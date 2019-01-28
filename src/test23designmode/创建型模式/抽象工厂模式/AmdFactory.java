package test23designmode.创建型模式.抽象工厂模式;

import test23designmode.创建型模式.model.AMDCPU;
import test23designmode.创建型模式.model.AMDMainBoard;
import test23designmode.创建型模式.model.CPU;
import test23designmode.创建型模式.model.MainBoard;

/**
 * Title:
 * Description:
 *
 * @author liujinlei
 * @version 1.0
 */
public class AmdFactory implements ComputerFactory {
    @Override
    public CPU makeCPU() {
        return new AMDCPU();
    }

    @Override
    public MainBoard makeMainBoard() {
        return new AMDMainBoard();
    }
}
