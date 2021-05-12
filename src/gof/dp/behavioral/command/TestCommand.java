package gof.dp.behavioral.command;

public class TestCommand {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();
        manager.addTask(new CommandTask(new BackupTask(),"backup server"));
        manager.addTask(new CommandTask(new ReceiveUpdatesTask(),"summer update"));

        System.out.println("Application running");
        manager.execute();
        manager.execute();
        System.out.println("Application running");

    }
}
