package aop.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class NewLoggingAspect {

    @Around("execution(public String returnBook())")
    public Object aroundReturnBookLoggingAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("aroundReturnBookLoggingAdvice: в библиотеку" +
                " пытаются вернуть книгу");
//        long begin = System.currentTimeMillis();
        Object targetMethodResult = null;
        try {
            targetMethodResult = proceedingJoinPoint.proceed();
        }catch (Exception e){
            System.out.println("aroundReturnBookLoggingAdvice: Было поймано исключение " + e );
            targetMethodResult = "Название книги не известно";
            throw e;
        }

//        targetMethodResult = "Преступление и наказание";

//        long ends = System.currentTimeMillis();

        System.out.println("aroundReturnBookLoggingAdvice: в библиотеку" +
                " успешно вернули книгу");
//        System.out.println("Время работы " + (ends - begin) + " миллисекунд");
        return targetMethodResult;

    }
}
