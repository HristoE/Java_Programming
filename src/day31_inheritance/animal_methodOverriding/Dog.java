package day31_inheritance.animal_methodOverriding;

public class Dog extends Animal {

    public Dog(String name, String breed, String size, String color, char gender, int age) {
        super(name, breed, size, color, gender, age);
    }

    @Override
    public void eat() {
        System.out.println(  getName() +" is eating dog food ");
    }

}
