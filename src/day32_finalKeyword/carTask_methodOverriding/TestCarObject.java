package day32_finalKeyword.carTask_methodOverriding;

public class TestCarObject {
    public static void main(String[] args) {
        Toyota toyota = new Toyota("camry","gray",2008,5000);
        Tesla tesla = new Tesla(" Model 3","White", 2009,54500);
        System.out.println(toyota);
        System.out.println(tesla);
        System.out.println("____________");

        toyota.start();
        tesla.start();


    }
}
