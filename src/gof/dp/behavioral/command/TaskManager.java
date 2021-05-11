package gof.dp.behavioral.command;

import java.util.ArrayList;
import java.util.List;

//Invoker
public class TaskManager {

    List<AbstractTask> tasks = new ArrayList<>();

    public void addTask(AbstractTask abstractTask) {
        tasks.add(abstractTask);
    }

    public void execute() {
        if(tasks.size() > 0) {
            tasks.get(0).doTask();
            tasks.remove(0);
        }
    }

}
