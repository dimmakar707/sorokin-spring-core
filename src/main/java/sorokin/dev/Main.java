package sorokin.dev;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("sorokin.dev");

        TaskManager taskManager = context.getBean(TaskManager.class);
        taskManager.printTask();

        TaskExecutor taskExecutor = context.getBean(TaskExecutor.class);
        taskExecutor.executeTask();

        context.close();
    }
}
