package spring_introduction;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.text.Annotation;

public class Test6 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);
        Pet cat = context.getBean("catBean", Pet.class);
        Pet cat2 = context.getBean("catBean", Pet.class);
        cat.say();

        Person person = context.getBean("personBean", Person.class);
        person.sallYourPet();

//        Person person2 = context.getBean("personBean", Person.class);
//        person2.sallYourPet();

        System.out.println(person.getAge());
        System.out.println(person.getSurname());

        context.close();

    }
}
