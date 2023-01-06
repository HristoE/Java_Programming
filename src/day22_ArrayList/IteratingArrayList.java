package day22_ArrayList;

import java.util.ArrayList;

public class IteratingArrayList {


    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(100);
        numbers.add(200);
        numbers.add(300);
        numbers.add(400);
        numbers.add(500);
        numbers.add(3,255);
        for (int i = 0; i < numbers.size(); i++) {

          int each  = numbers.get(i);
            System.out.println(each);

        }

        for (int i = numbers.size() - 1; i >= 0; i--) {
            System.out.println(numbers.get(i));
        }

        System.out.println("___________________________________");

        for (Integer each : numbers) {
            System.out.println(each);
        }






    }
}
