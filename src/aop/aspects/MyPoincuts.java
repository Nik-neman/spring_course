package aop.aspects;

import org.aspectj.lang.annotation.Pointcut;

public class MyPoincuts {

//    @Pointcut("execution(* add*(..))")
    @Pointcut("execution(* abc*(..))")
    public void allAddMethods(){}
}
