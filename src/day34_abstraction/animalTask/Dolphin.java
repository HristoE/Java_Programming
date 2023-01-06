package day34_abstraction.animalTask;

public class Dolphin extends  Animal implements  WildAnimal, Swimmable, Playable{
    public Dolphin(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println( " Dolphin "+ getName() + " is eating fish ");
    }

    @Override
    public void hunt() {
        System.out.println( " Hunts fishes ");
    }

    @Override
    public void play() {
        System.out.println( " May like to play in the water ");

    }

    @Override
    public void swim() {
        System.out.println( " is a good swimmer ");

    }
}
