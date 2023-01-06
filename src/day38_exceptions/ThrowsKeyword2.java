package day38_exceptions;

public class ThrowsKeyword2 {


    public static void main(String[] args) {

    }

    public static void pauseFor5Seconds() throws InterruptedException {
        Thread.sleep(5000);
    }


    public static void method1() throws InterruptedException {
        System.out.println("Hellow word ");
        pauseFor5Seconds();
        System.out.println( "hello Cydeo");
    }
}
