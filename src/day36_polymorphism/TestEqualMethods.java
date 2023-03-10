package day36_polymorphism;

public class TestEqualMethods {
    public static void main(String[] args) {
         Circle circle1 = new Circle( 5);

        Circle circle2 = new Circle( 5);

        Circle circle3 = new Circle( 15);
        System.out.println( circle1 == circle2);
        System.out.println( circle1.equals(circle2));

        System.out.println(circle1.equals(circle3));
    }
}
