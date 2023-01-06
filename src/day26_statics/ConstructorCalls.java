package day26_statics;

public class ConstructorCalls {


    public static void main(String[] args) {


        method2();

        System.out.println("-____________________");
    }
    public  static void method1(){
        System.out.println("Method 1 ");
    }

    public  static void method2(){
        method1();
        System.out.println("Method 2 ");
    }

}
