package test23designmode.结构型模式.适配器模式.默认适配器模式;

import java.io.File;

/**
 * Title:
 * Description:
 *
 * @author liujinlei
 * @version 1.0
 */
public class FileMonitor extends FileAlterationListenerAdaptor {
    public void onFileCreate(final File file) {
        // 文件创建
        //doSomething();
    }

    public void onFileDelete(final File file) {
        // 文件删除
        //doSomething();
    }
}