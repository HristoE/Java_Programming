package day16_nestedLoop;

import java.util.Scanner;

public class LoopPractice {
    public static void main(String[] args) {

        for (int i = 0; i < 6; i++) {
            System.out.println("Hello for loop" + i);

        }
        System.out.println("-----------FOR LOOP---------------");
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello " + i);
        }
        System.out.println("_____WHILE LOOP_____________________");


        int j = 0;
        while (j < 5) {
            System.out.println("Hello " + j);
            j++;
        }
        System.out.println("___________DO WHILE _______________");



        int k = 0;
        do {
            System.out.println( "hello "+k);
            k++;
        }while (k<5);
        System.out.println("_____________________________");

        Scanner input = new Scanner( System.in);

        System.out.println( "Enter your score ");
        int score = input.nextInt();
        while (score >100 || score<0){
            System.out.println( "Enter your score, re-enter your score");
            score =  input.nextInt();

        }
        if (score>= 60 ){
            System.out.println("Passed");
        }else {
            System.out.println("failed ");
        }


    }


}
