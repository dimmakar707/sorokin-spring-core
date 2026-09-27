package sorokin.dev;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("sorokin.dev");
//        Task task = context.getBean(Task.class);
//        Task task2 = (Task) context.getBean("main-task");

//        System.out.println(task);
//        System.out.println(task2);
//        System.out.println(task == task2);

        TaskManager taskManager = (TaskManager) context.getBean("taskManager");
        taskManager.printTask();
    }
}
