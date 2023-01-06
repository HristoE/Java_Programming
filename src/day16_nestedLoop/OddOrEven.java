package day16_nestedLoop;

import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while ( true ) {

            System.out.println("Enter a number ");
            int number = input.nextInt();
            if (number % 2 == 0) {
                System.out.println( number  +" is Even");
            } else {
                System.out.println(number + " is Odd");

            }
            System.out.println(" Would you like another try. Yes/No ?");
            String answer = input.next();

            answer= answer.toLowerCase();
            while( !(answer.equals("yes")|| (answer.equals("no")))){
                System.err.println( "Would you like another try. Y/N ?");
                answer = input.next().toLowerCase();
            }

            if( answer.equals("no")){
                break;
            }

        }



    }




}
