package test23designmode.创建型模式.抽象工厂模式;

import test23designmode.创建型模式.model.CPU;
import test23designmode.创建型模式.model.Computer;
import test23designmode.创建型模式.model.MainBoard;

/**
 * Title: 抽象工厂模式
 * Description: 要点：
 * 1.避免 “随意混搭”
 * 2.不再需要单独挑选 CPU厂商、主板厂商、硬盘厂商等，直接选择一家品牌工厂，品牌工厂会负责生产所有的东西，而且能保证肯定是兼容可用的
 * 3.没有3
 *
 * @author liujinlei
 * @version 1.0
 */
public class Test2 {

    public static void main(String[] args) {
        // 第一步就要选定一个“大厂”,这里选择了AMD的大厂
        ComputerFactory cf = new AmdFactory ();
        // 从这个大厂造 CPU
        CPU cpu = cf.makeCPU();
        // 从这个大厂造主板
        MainBoard board = cf.makeMainBoard();
        // 从这个大厂造硬盘

        // 将同一个厂子出来的 CPU、主板、硬盘组装在一起
        Computer result = new Computer(cpu, board);
    }

}
