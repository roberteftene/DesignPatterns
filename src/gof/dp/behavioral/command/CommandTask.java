package gof.dp.behavioral.command;

//ConcreteCommand
public class CommandTask extends AbstractTask {
    String taskName;
    GameAPIModule executioner = null;

    public CommandTask(GameAPIModule executioner, String taskName) {
        this.executioner = executioner;
        this.taskName = taskName;
    }

    @Override
    public void doTask() {
        executioner.doTask(this.taskName);
    }
}
