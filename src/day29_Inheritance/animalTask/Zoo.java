package day29_Inheritance.animalTask;

public class Zoo {


    public static void main(String[] args) {


Dog dog = new Dog();
dog.setInfo("Jumpy","husky",'M',4,"small","gray");

Cat cat = new Cat();
cat.setInfo("Tom","house",'F',4,"biggg","gray");
Tiger tiger = new Tiger();

tiger.setInfo("Tiger", "bengal",'M',2,"large","orange");
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(tiger);


        dog.eat();
        cat.sleep();
        //tiger.hunt();
    }
}
