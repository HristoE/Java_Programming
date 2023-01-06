package day19_array;

import java.util.Arrays;

public class ArrayLiterals {


    public static void main(String[] args) {

        int[]numbers = new int[5];

        int[]nums = {1,2,3,4,5};

        System.out.println(numbers.length);
        System.out.println(nums.length);
        System.out.println("nums = " + Arrays.toString(numbers));
        System.out.println("nums = " + Arrays.toString(nums));


        System.out.println("---------------------------------");

        String[] days = {"Monday", "Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        // index numbers  0           1         2          3          4          5         6
        int n = 1;
        System.out.println( days [n-1]);// We are starting from 0 ,so Monday is the NUMBER - 1 to get the right number




    }
}
