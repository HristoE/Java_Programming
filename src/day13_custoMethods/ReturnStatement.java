package day13_custoMethods;

public class ReturnStatement {


    public static void main(String[] args) {

        eligible(155);

    }



    public static void eligible( int age){

        if(age< 0 || age>150){
            System.err.println("Invalid age ");
            return;// exit the method

            // if the age is invalid this method is terminated
        }


        if(age >=21){

            System.out.println( " you are eligible to buy alcohol");
        }else {
            System.out.println("You are not eligible ");
        }
    }



}
