package test23designmode.结构型模式.适配器模式.默认适配器模式;

import java.io.File;

/**
 * Title:
 * Description:
 *
 * @author liujinlei
 * @version 1.0
 */
public class FileAlterationListenerAdaptor implements FileAlterationListener {
    @Override
    public void onStart(FileAlterationObserver observer) {

    }

    @Override
    public void onDirectoryCreate(File directory) {

    }

    @Override
    public void onDirectoryChange(File directory) {

    }

    @Override
    public void onDirectoryDelete(File directory) {

    }

    @Override
    public void onFileCreate(File file) {

    }

    @Override
    public void onFileChange(File file) {

    }

    @Override
    public void onFileDelete(File file) {

    }

    @Override
    public void onStop(FileAlterationObserver observer) {

    }
}
