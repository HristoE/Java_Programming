package day34_abstraction.animalTask;

public class Parot extends  Animal implements Flyable{
    public Parot(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println( " Parrots eats seeds");
    }

    @Override
    public void fly() {
        System.out.println( getName() + " if bad flyer");
    }
}
