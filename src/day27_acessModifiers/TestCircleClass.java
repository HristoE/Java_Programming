package day27_acessModifiers;

public class TestCircleClass {


    public static void main(String[] args) {


        Circle circle1 = new Circle(3.5);
        Circle circle2 = new Circle(5);
        Circle circle3 = new Circle(7);

        System.out.println(circle1);
        System.out.println(circle2);
        System.out.println(circle3);

        System.out.println(Circle.pi);// to call static values is done through the Class
        System.out.println(circle1.radius);// instance variables are called through the OBJECT ( they belong to the object )
    }
}
