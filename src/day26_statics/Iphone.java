package day26_statics;

public class Iphone {


    public static  String brand = "Apple"; //  static as all object brand is the same brand
    public String model; // instance as its diferent models
    public String color;
    public double price;
    public static String OS = "iOS";
    public static String madeIn = "China";
    public static boolean  hasBattery = true;
    public static boolean isTouchScreen = true;

    public Iphone(String model, String color, double price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }

    public  void printPhoneInfo (){ // Instance methods are used always with instance varibles, if the varible is static will be compile eror
        System.out.println("Model "+ model);
        System.out.println("color = " + color);
        System.out.println("brand = " + brand);

    }

}
/*

instance versus static usage :

TASK: choose which object are instance and which one are static. Static - all object will have the same varible like MAKE "APPLE"
attributes
brand , model , color, OS, madeIn
 */