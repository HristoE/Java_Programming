package day16_nestedLoop;

import java.util.Scanner;
import java.util.SortedMap;

public class CydeoLogIn {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your username ");

        String u = input.next();
        System.out.println("Enter your password");
        String p = input.next();

        if (u.equals("Cydeo") && p.equals("WoodenSpoon")) { // if credentials are valid user will log in
            System.out.println("Logged in ");

        } else {
            for (int i = 0; i < 3; i++) {

                if (i != 2) {// additional condition ,
                    System.err.println(" Incorrect  username Or password. Please reenter ");
                } else {
                    System.out.println("This is your last attempt, please re-enter your username and password");
                }


                System.out.println("Enter username ");
                u = input.next();
                System.out.println("Enter your password");
                p = input.next();

                if (u.equals("Cydeo") && p.equals("WoodenSpoon")) {// if user enter valid credentials teh system will exit the loop
                    System.out.println("You Are Logged In ");
                    break;
                }
            }
            if (!(u.equals("Cydeo") && p.equals("WoodenSpoon"))) {// if attemps are failed after 3 times this messege will be displayed
                System.err.println("Your account is now locked  ");//
            }
        }
        input.close();
    }
}


/*
1. Create a class named CydeoLogIn. you are writing a code for the log-in function of the Cydeo Application, assume that your credentials are:
                    username: Cydeo
                    password: WoodenSpoon
        Ask the user to enter their credentials.
                If credentials are matched, your program should print "Logged in."
                If the credentials are not matched, the program should allow
                the user to have three attempts to enter correct credentials
                if all three attempts are failed, then print "Your account is lucked."
 */