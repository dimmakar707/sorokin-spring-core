package sorokin.dev;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import sorokin.dev.aop.Loggable;

@Component
public class TaskManager {

    private final Task task;

    public TaskManager(Task task) {
        this.task = task;
//        System.out.println("Call taskManager constructor");
    }

    @Loggable
    public Integer printTask() {
        System.out.println("Current task: " + task.toString());
//        throw new RuntimeException("Exception in taskManager ");
        return task.getDuration();
    }

    @PostConstruct
    public void postConstruct() {
//        System.out.println("taskManager post construct");
    }

    @PreDestroy
    public void preDestroy() {
//        System.out.println("taskManager pre destroy");
    }

}
