package gof.dp.behavioral.command;

public class ReceiveUpdatesTask implements GameAPIModule {
    @Override
    public void doTask(String taskName) {
        System.out.println("Gathering updates for... " + taskName);
    }
}
