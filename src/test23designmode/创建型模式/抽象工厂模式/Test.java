package test23designmode.创建型模式.抽象工厂模式;

import test23designmode.创建型模式.model.CPU;
import test23designmode.创建型模式.model.Computer;
import test23designmode.创建型模式.model.MainBoard;

/**
 * Title: 抽象工厂模式
 * Description: 要点：
 * 1：与简单工厂模式相比：抽象工厂模式突出的是 “组装” 的概念
 * 2：以组装电脑为例，主板 与 cpu 必须得兼容，于是我们就可以按照“兼容”的组装来生产电脑
 * 3. 问题来了，版本兼容还是不兼容我们如何知道 ？ 所以我们需要做一些避免”随意混搭“的操作
 * 4.看Test2
 *
 * @author liujinlei
 * @version 1.0
 */
public class Test {

    public static void main(String args []){
        // 得到 Intel 的 CPU
        CPUFactory cpuFactory = new IntelCPUFactory();
        CPU cpu = cpuFactory.makeCPU();

        // 得到 AMD 的主板
        MainBoardFactory mainBoardFactory = new AmdMainBoardFactory();
        MainBoard mainBoard = mainBoardFactory.makeBoard();

        // 组装 CPU 和主板
        Computer computer = new Computer(cpu, mainBoard);
    }

}
