package sorokin.dev;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("sorokin.dev");

        Task task1 = context.getBean(Task.class);
        Task task2 = context.getBean(Task.class);
        System.out.println(task1 == task2);

        TaskManager taskManager = (TaskManager) context.getBean("taskManager");
        taskManager.printTask();

        TaskManager taskManager2 = (TaskManager) context.getBean("taskManager");
        taskManager.printTask();

        TaskExecutor taskExecutor = context.getBean(TaskExecutor.class);
        taskExecutor.executeTask();

        context.close();
    }
}
