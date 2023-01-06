package day23_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethods {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5,};
        array[0] = 100;// updating  the element in array
        System.out.println(Arrays.toString(array));


        System.out.println("________________________");


        ArrayList <String> grosseryList = new ArrayList<>();
        grosseryList.add ("eggs");
        grosseryList.add ("paper towels");
        grosseryList.add ("Apples");
        grosseryList.add ("Cooking oil ");

        System.out.println( grosseryList);

        grosseryList.set(2,"Oranges");// updating elements in ArrayList

        System.out.println( grosseryList);



    }
}
