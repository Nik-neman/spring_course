package spring_introduction;

public class Person {
    private Pet pet;
    private String surname;
    private  int age;

    public Person(){

    }

    public Person(Pet pet){
        this.pet = pet;
    }

    public  void  sallYourPet() {
        System.out.println("Hello, my lovely Pet!");
        pet.say();
    }

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
