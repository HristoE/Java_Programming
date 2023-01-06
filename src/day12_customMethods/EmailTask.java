package day12_customMethods;

public class EmailTask {
    public static void main(String[] args) {

       String email = "mike_tyson@gmail.com";
       String firstName = email.substring(0,email.indexOf("@"));

       String lastName = email.substring(email.indexOf("_")+1, email.indexOf("@"));

       String rest = email.substring(email.indexOf("@"));

        email= lastName + " "+ firstName + rest;

        System.out.printf(email);




    }
}
