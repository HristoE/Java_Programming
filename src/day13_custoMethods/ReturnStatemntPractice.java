package day13_custoMethods;

import java.util.Scanner;

public class ReturnStatemntPractice {

    public static void main(String[] args) {
       char grade = new Scanner( System.in).next().charAt(0);

       boolean isValid = grade == 'A' || grade == 'B' || grade== 'C' || grade == 'D' || grade == 'F';
       if (isValid){
           System.err.println("Invalid grade ");
           return;// this will terminate main method

       }
        System.out.println( (grade == 'A')?"Excellent" : (grade == 'B')? "great Job" :(grade )== 'C'? "Good"
                : ( grade) == 'D'?"Pass":"Failed");




    }
}
