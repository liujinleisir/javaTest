package test23designmode.结构型模式.适配器模式.默认适配器模式;

import java.io.File;

/**
 * Title:
 * Description:
 *
 * @author liujinlei
 * @version 1.0
 */
public interface FileAlterationListener {
    void onStart(final FileAlterationObserver observer);
    void onDirectoryCreate(final File directory);
    void onDirectoryChange(final File directory);
    void onDirectoryDelete(final File directory);
    void onFileCreate(final File file);
    void onFileChange(final File file);
    void onFileDelete(final File file);
    void onStop(final FileAlterationObserver observer);
}
