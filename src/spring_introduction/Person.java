package spring_introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component("personBean")
public class Person {


//@Autowired
//@Qualifier("catBean")
    private Pet pet;
@Value("${person.surname}")
    private String surname;
@Value("${person.age}")
    private  int age;

    public Person(){
        System.out.println("Person bean is created1");
    }

// @Autowired

    public Person(Pet pet){
        System.out.println("Person bean is created2");
        this.pet = pet;
    }

    public  void  sallYourPet() {
        System.out.println("Hello, my lovely Pet!");
        pet.say();
    }
//@Autowired
//@Qualifier("dog")
    public void setPet(Pet pet) {
        System.out.println("Class person: set pet");
        this.pet = pet;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
