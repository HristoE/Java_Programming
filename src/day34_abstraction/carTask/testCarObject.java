package day34_abstraction.carTask;

import day14_forLoop.WarmUpTask;

public class testCarObject {
    public static void main(String[] args) {

 Tesla tesla1 = new Tesla("Model Y ",2008,50000, "white");
 tesla1.start();
 tesla1.autopilot();
 tesla1.stop();

 Honda honda= new Honda( " CVR",2007,40000,"grey ");
  honda.stop();
 Audi audi = new Audi( "Q5",2022,50000,"black");
        audi.start();
        audi.stop();
        audi.autoPark();


        System.out.println(tesla1);
        System.out.println(audi);
        System.out.println( honda);
    }




}
