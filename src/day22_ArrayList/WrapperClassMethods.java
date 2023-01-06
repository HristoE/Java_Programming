package day22_ArrayList;

public class WrapperClassMethods {
    public static void main(String[] args) {

        String str = "20";
        System.out.println(str + 1); //  result will be 201

        int num1 = Integer.parseInt(str);

        System.out.println(num1 + 1);// result is 21

        String string = "a1,b4,c7,e7";
        System.out.println("_________________________________");
        int sum = 0;

        for (char each : string.toCharArray()) {
            if (Character.isDigit(each)) {
                sum +=Integer.parseInt(""+each);

            }


        }
        System.out.println("sum = "+sum);
    }
}