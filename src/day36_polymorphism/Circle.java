package day36_polymorphism;

import day35_polymorphism.PolymorphismIntro;

public class Circle {
    private double radius;
    public final static double PI = 3.14;


    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    public double area() {
        return radius * radius * PI;
    }

    public double perimeter() {
        return 2 * radius * PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                "area=" + area() +
                "perimeter =" + perimeter() +
                '}';
    }

    @Override
    public boolean equals(Object obj) {// if the object is not a cicrle, then we should not compare
        if (!(obj instanceof Circle)) {
            System.err.println("Invalid Object ");
            System.exit(1);
        }
        if (radius == ((Circle) obj).radius) { // if the current circle radius is equal to the given circle radius, then thew are equal
            return true;
        }
        return false;
    }




}

