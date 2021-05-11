package gof.dp.behavioral.command;

public class BackupTask implements GameAPIModule {
    @Override
    public void doTask(String taskName) {
        System.out.println("Backup in progress for... " + taskName);
    }
}
