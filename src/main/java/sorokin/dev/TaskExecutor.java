package sorokin.dev;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import sorokin.dev.aop.Loggable;

@Component
public class TaskExecutor {

    private final Task task;

    public TaskExecutor(Task task) {
        this.task = task;
    }

    @Loggable(value="ERROR", times=2)
    public void executeTask() {
        System.out.println("execute task with name: %s, total seconds: %s " . formatted(task.getName(), task.getDuration()) );
    }

}
