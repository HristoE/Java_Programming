package day13_custoMethods;

public class ReturnMethodIntro {
    public static void main(String[] args) {


        int total = addition(10, 20);

        square(10
        );
        System.out.println(square(10));
    }


    public static int addition(int n1, int n2) {
        int result = n1 + n2;
        return result;


    }


    public static int square ( int num ){

        int square = num * num;
        return square;


    }




}
