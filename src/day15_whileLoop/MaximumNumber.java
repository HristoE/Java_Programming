package day15_whileLoop;

import java.util.Scanner;

public class MaximumNumber {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int max = -2147483648;// after loop execution the max number for the user will be assigned to max varible


        for (int i=0; i<5; i ++);{
            System.out.println("Eneter a number ");
            int num = input.nextInt();//10,5,3,20,15 - user entries example

            if (num > max){// that's the condition to determinate if user number is grater than INT MIN ( goodle ) number
                max = num;
            }
        }
        System.out.println("max = " +max);
        input.close ();

    }


}



















/*
1. Write a program that can ask the user to enter a number for 5 times and returns the maximum number
 */