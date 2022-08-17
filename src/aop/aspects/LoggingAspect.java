package aop.aspects;

import aop.Book;
import aop.SchoolLibrary;
import aop.UniLibrary;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.aspectj.lang.annotation.Aspect;


@Component
@Aspect
@Order(1)
public class LoggingAspect {

//    @Pointcut("execution(* aop.UniLibrary.*(..))")
//    private void allFromUnilibrary(){}
//
//    @Pointcut("execution(* aop.UniLibrary.returnMagazine())")
//    private void returnMagazineFromUnilibrary(){}
//
//    @Pointcut("allFromUnilibrary() && !returnMagazineFromUnilibrary()")
//    private void allMethodsExceptReturnMagazinFromUnilibrary(){}
//
//    @Before("allMethodsExceptReturnMagazinFromUnilibrary()")
//    private void beforeallMethodsExceptReturnMagazinAdvice(){
//        System.out.println("eforeallMethodsExceptReturnMagazinAdvice: Log #10");
//    }



    @Before("aop.aspects.MyPoincuts.allAddMethods()")
    public void beforAddLoggingAdvice(JoinPoint joinPoint){

        MethodSignature methodSignature =(MethodSignature) joinPoint.getSignature();
        System.out.println("methodSignature = " + methodSignature);
        System.out.println("methodSignature.getMethod() = " + methodSignature.getMethod());
        System.out.println("methodSignature.getReturnType() = " + methodSignature.getReturnType());
        System.out.println("methodSignature.getName() = " + methodSignature.getName());

        if(methodSignature.getName().equals("addBook")){
           Object[] arguments = joinPoint.getArgs();
           for (Object obj: arguments ){
               if(obj instanceof Book){
                   Book myBook = (Book) obj;
                   System.out.println("Информация о книге: название - " +
                           myBook.getName() + ", автор - " + myBook.getAuthor() +
                           ", год издания - " + myBook.getEarOfPublication());
               } else  if(obj instanceof String){
                   System.out.println("Книгу в библиотеку добавляет " + obj);
               }
           }
        }
        System.out.println("beforeGetLoggingAdvice: логирование + " +
            "попытка получить книгу/журнал");
        System.out.println("----------------------------------------" );
    }


//    @Pointcut("execution(* aop.UniLibrary.get*())")
//    private void allGetMethodFromUnilibrary(){}
//
//    @Pointcut("execution(* aop.UniLibrary.return*())")
//    private void allReturnMethodFromUnilibrary(){}
//
//    @Pointcut("allGetMethodFromUnilibrary() || allReturnMethodFromUnilibrary()")
//    private void allGetAndReturnMethodFromUnilibrary(){}

//    @Pointcut("execution(* aop.UniLibrary.add*())")
//    private void allAddMethodFromUnilibrary(){}

//@Before("allGetMethodFromUnilibrary()")
//    public void beforGetLoggingAdvice(){
//    System.out.println("beforeGetBookAdvice: writing Log #1");
//}
//
//    @Before("allReturnMethodFromUnilibrary()")
//    public void beforReturnLoggingAdvice(){
//        System.out.println("beforeGetBookAdvice: writing Log #2");
//    }
//
//    @Before("allGetAndReturnMethodFromUnilibrary()")
//    public void beforGetAndReturnLoggingAdvice(){
//        System.out.println("beforeGetBookAdvice: writing Log #3");
//    }
//


//    @Before("allAddMethodFromUnilibrary()")
//    public void beforAddLoggingAdvice(){
//        System.out.println("beforeGetBookAdvice: writing Log #2");
//    }


//    @Pointcut("execution(* get*())")
//    private  void allGetMethods(){}
//
//    @Before("allGetMethods()")
//    public void beforeGetLoggingAdvice1(){
//        System.out.println("beforeGetBookAdvice: попытка получить книгу или журнал");
//    }
//
//    @Before("allGetMethods()")
//    public void beforeGetSecurityAdvice1(){
//        System.out.println("beforeGetBookAdvice: проверка прав на получение книги или журнала");
//    }

//    @Before("execution(public void aop.UniLibrary.getBook())")
//    public void beforeGetBookAdvice2(){
//        System.out.println("beforeGetBookAdvice: попытка получить книгу ");
//    }
//@Before("execution(public * returnBook())")
//public void beforeReturnBookAdvice1(){
//    System.out.println("beforeGetBookAdvice: попытка вернуть книгу ");
//}
}
