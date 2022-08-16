package spring_introduction;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//import javax.annotation.PostConstruct;
//import javax.annotation.PreDestroy;

//@Component("dog")
//@Scope("prototype")
public class Dog implements Pet{

    public Dog(){
        System.out.println("Dog bean is created");
    }

    @Override
    public void say(){
        System.out.println("Bow-Wow");
    }
//
//    @PostConstruct
    public void init(){
        System.out.println("Class Dog: init metod");
    }

//    @PreDestroy
    public void destroy(){
        System.out.println("Class Dog: destroy metod");
    }

}
