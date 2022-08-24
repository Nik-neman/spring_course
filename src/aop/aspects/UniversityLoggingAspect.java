package aop.aspects;

import aop.Student;
import org.aspectj.lang.annotation.*;
import org.springframework.beans.PropertyAccessorUtils;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class UniversityLoggingAspect {

    @Before("execution(* getStudents())")
    public void beforeGetStudentsLoggingAdvice(){
        System.out.println("beforeGetStudentsLoggingAdvice: логируем получение " +
                "списка студентов перед методом getStudents");
    }
//    @AfterReturning(pointcut = "execution(* getStudents())"
//                    ,returning = "students")
//    public void afterReturningGetStudentsLoggingAdvice(List<Student> students){
//        Student firstStudent = students.get(0);
//        System.out.println(firstStudent);
//
//        String nameSurname = firstStudent.getNameSurname();
//        nameSurname = "Mr. " + nameSurname;
//        firstStudent.setNameSurname(nameSurname);
//
//        double avgGrade = firstStudent.getAvgGrade();
//        avgGrade = avgGrade+1;
//        firstStudent.setAvgGrade(avgGrade);
//
//        System.out.println("beforeGetStudentsLoggingAdvice: логируем получение " +
//                "списка студентов после методом getStudents");
//    }

//    @AfterThrowing(pointcut = "execution(* getStudents())",
//     throwing = "exeption")
//    public void afterThrowingGetStudentsLoggingAdvice(Throwable exeption){
//        System.out.println("afterThrowingGetStudentsLoggingAdvice: логируем выброс "+
//                "исключения" + exeption);
//    }

    @After("execution(* getStudents())")
    public void afterGetStudentsLoggingAdvice(){
        System.out.println("afterGetStudentsLoggingAdvice: логируем нормальное "+
                "окончание работы метода или выброс исключения");
    }
}
