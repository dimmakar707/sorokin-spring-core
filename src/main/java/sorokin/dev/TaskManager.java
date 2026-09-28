package sorokin.dev;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class TaskManager {

    private final Task task;

    public TaskManager(Task task) {
        this.task = task;
        System.out.println("Call taskManager constructor");
    }

    public void printTask() {
        if(task == null) {
            System.out.println("No current task");
        } else {
            System.out.println("Current task: " + task.toString());
        }
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("taskManager post construct");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("taskManager pre destroy");
    }

}
