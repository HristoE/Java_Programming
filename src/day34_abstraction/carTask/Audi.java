package day34_abstraction.carTask;

import java.util.SortedMap;

public class Audi  extends Car{
    public Audi(String model, int year, double price, String color) {
        super(model, year, price, color);

    }

    @Override
   public  void start() {
        System.out.println( " Push the button " + getMake() +" " + getModel());
    }



    public void autoPark(){
        System.out.println( getMake() + " "+ getModel() + " has autostart option");

    }
}
