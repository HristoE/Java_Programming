package day35_polymorphism.transpoartationTask;

import day34_abstraction.animalTask.Flyable;

public abstract class Plane extends Transportation implements Flyable {


    public Plane(String make, String model, String color, int year, double price) {
        super(make, model, color, year, price);
    }


    public void land(){
        System.out.println( "plane "+ getMake() + " "+ getModel() + " "+ "is landing ");
    }

    @Override
    public void fly() {
        System.out.println( getMake() + " " + getModel() + " is flying ");
    }
}
