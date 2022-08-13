package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext2.xml");
        Dog myDog = context.getBean("myPet", Dog.class);
        Dog yourDog = context.getBean("myPet", Dog.class);
//        Cat yourCat = context.getBean("myPet", Cat.class);
        System.out.println(myDog == yourDog);
        System.out.println(myDog);
        System.out.println(yourDog);

    }
}
