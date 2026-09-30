package sorokin.dev.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

//    @Before("execution(* sorokin.dev.TaskManager.*(..))") //Для любого метода из класса TaskManager, возвращающего любой тип и принимающего любой список параметров
//    public void logBefore(JoinPoint joinPoint) {
//        System.out.println("Перед вызовом метода: " + joinPoint.getSignature().getName());
//    }
//
//    @AfterReturning(value = "execution(* sorokin.dev.TaskManager.*(..))", returning = "result")
//    public void logAfterReturning(JoinPoint joinPoint, Object result) {
//        System.out.println("После возвращения результата: " + joinPoint.getSignature().getName() + " результат=" + result);
//    }
//
//    @AfterThrowing(value = "execution(* sorokin.dev.TaskManager.*(..))", throwing = "exc")
//    public void afterThrowing(JoinPoint joinPoint, Exception exc) {
//        System.out.println("После исключения: " + exc.getMessage());
//    }
//
//    @After("execution(* sorokin.dev.TaskManager.*(..))")
//    public void after(JoinPoint joinPoint) {
//        System.out.println("После выполнения метода: " + joinPoint.getSignature().getName());
//    }

//    @Around("execution(* sorokin.dev.TaskManager.*(..))")
//    public Object logAround(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
//        System.out.println("До метода");
//        Integer result = (Integer) proceedingJoinPoint.proceed(); //Тут произойдёт вызов оригинального метода из класса (в данном случае TaskManager)
//        System.out.println("После метода");
//        //Код после вызова метода
//        return result/2;
//    }

    @Before("@annotation(loggable)")
    public void log(JoinPoint joinPoint, Loggable loggable) {
        for(int i = 1; i <= loggable.times(); i++) {
            System.out.printf("LOG %s: before method=%s\n", loggable.value(), joinPoint.getSignature().getName());
        }
    }
}
