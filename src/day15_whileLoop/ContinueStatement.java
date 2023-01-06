package day15_whileLoop;

public class ContinueStatement {

    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {

            if (i==4){
                continue;
            }
            System.out.println(i);

        }


        System.out.println("--------------------------");

        for (int i = 10; i <20 ; i++) {
            if( i%2 == 0 ){//if i is even - loop will skip the iteration
                continue;
            }System.out.println(i);
            System.out.println("__________________________________________");



            for (char x= 'A'; x<= 'G'; x++){
               if (i == 'B' || i=='E'){
                    continue;
                }

                System.out.println( x );

            }

        }
    }
}
