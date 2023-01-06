package day12_customMethods;

public class CustomMethodsPractice {
    public static void main(String[] args) {
        maxNum(1000, 5000);
initial("John", "Smith ");

    }


    // method to create to print max number between 2 given numbers
    public static void maxNum(double num1, double num2) {

        if (num1 > num2) {
            System.out.println(num1 + " is greater ");
        } else if (num2 > num1) {

            System.out.println(num2 + " is greater ");
        } else {
            System.out.println("equal");
        }


    }


// create a method that can display initial of the person


    public static void initial(String firstName, String lastName){
        String initial = firstName.charAt(0)+ "."+lastName.charAt(0);
        System.out.println( "initial is : " + initial);



    }










}