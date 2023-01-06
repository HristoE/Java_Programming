package day38_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowKeyword {
    public static void main(String[] args) {

        System.out.println( "Enter your age ");
        int age = new Scanner(System.in).nextInt();
        if (age<0 || age >150){
            throw new InputMismatchException("Age cannot be negative: " + age);
        }
    }
}
