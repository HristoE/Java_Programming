package day16_nestedLoop;

public class DoWhileLoop {


    public static void main(String[] args) {


        boolean condition = false;


        for (; condition ;) // for loop
            System.out.println("Hi there" );

        System.out.println("--------------------------");

        while ( condition){// while loop
            System.out.println( "Hello Cydeo");
        }

        System.out.println( "____________________");


        do {
            System.out.println("Hello DO loop");
        }while ( condition );


    }

}
