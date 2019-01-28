package test23designmode.创建型模式.抽象工厂模式;

import test23designmode.创建型模式.model.AMDMainBoard;
import test23designmode.创建型模式.model.MainBoard;

/**
 * Title:
 * Description:
 *
 * @author liujinlei
 * @version 1.0
 */
public class AmdMainBoardFactory implements MainBoardFactory {
    @Override
    public MainBoard makeBoard() {
        return new AMDMainBoard();
    }
}
