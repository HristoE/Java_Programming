package day30_inheritance.phonetask;


import org.w3c.dom.html.HTMLAppletElement;

public class IPhone extends Phone {
    public IPhone( String model, String size, String color, double price){
        super("Apple", model, size, color, price);
    }
    public static boolean hasApplePay = true;

    public  void faceTime(long phoneNumber){
        System.out.println( getModel() +" is face timing with " +phoneNumber );
    }

    public void faceTime(String email){
        System.out.println( getModel() +" is face timing with " + email );
    }


}
/*

				Methods:
					call(long phoneNumber)
					text(long phoneNumber)
					toString()
 */