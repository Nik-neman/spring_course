package aop.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(3)
public class ExeptionHandlingAspect {

    @Before("aop.aspects.MyPoincuts.allAddMethods()")
    public void beforeAddExeptionHandlingAdvice(JoinPoint joinPoint){
        System.out.println("beforeGetExeptionHandlingAdvice: ловим/обрабатываем " +
                "исключения при попытке получить книгу/журнал");
        System.out.println("----------------------------------------" );
    }
}
