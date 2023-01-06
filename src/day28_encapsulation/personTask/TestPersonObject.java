package day28_encapsulation.personTask;

public class TestPersonObject {

    public static void main(String[] args) {


        Person person1 = new Person("John");
        Person person2 = new Person("Kal", "bulgarian");
        Person person3 = new Person("El", 33, 'F');


        System.out.println(person3);
        System.out.println(person2);
        System.out.println(person1);
        Person.planet = "Mars";
        Person.printPlanetName();

        person2.eat("Shit");
        person3.drink("milk");


    }
}
