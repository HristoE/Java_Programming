package day21_multiDimmensionalArray;

import utilities.ArraysUtility;

import java.util.Arrays;

public class AddElements {

    public static void main(String[] args) {

        int [] array = {1,2,3,4,5,};
        int element = 6;

        int [] new_array = Arrays.copyOf(array,array.length+1);
        new_array[new_array.length-1]=element;



        System.out.println(Arrays.toString(new_array));
        System.out.println("________________________________");

int[] numbers= {100,90,80,60,80};
       numbers = ArraysUtility.addElement(numbers,50);

        System.out.println(Arrays.toString(numbers));


    }
}
