package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfigWithAnnotation1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=
                new ClassPathXmlApplicationContext("applicationContext3.xml");

        Cat myCat = context.getBean("catBean", Cat.class);
        myCat.say();

        Person person = context.getBean("person",Person.class);
        person.sallYourPet();
        System.out.println(person.getAge() + " " + person.getSurname());

        context.close();
    }
}
