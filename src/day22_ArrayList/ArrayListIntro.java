package day22_ArrayList;

import java.util.Arrays;
import java.util.ArrayList;
public class ArrayListIntro {
    public static void main(String[] args) {

        int []array = new int [5];
        array [0]= 10;
        array [1] = 20;

        System.out.println(Arrays.toString(array));// it will display 10,20 and for the rest indexes will be 0 , int default for array is 0


ArrayList<Integer> list = new ArrayList<>();
        System.out.println(list);
        System.out.println( list.size());


    }


}
