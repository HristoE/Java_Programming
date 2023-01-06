package day21_multiDimmensionalArray;

import java.util.Arrays;

public class multiDimensionalArrayIntro {
    public static void main(String[] args) {


        int[] arr1 = {10, 20, 30};
        int[] arr2 = {40, 50, 60};
        int[] arr3 = {90, 100};


        System.out.println("------------------------");

        int[][] arr2D = {{10, 20, 30}, {40, 50, 60}, {90, 100}};
                          // Index numbers of arreys inside starts with 0 and end N-1
                         // EACH ELEMENT OT THE ARRAYS ALSO HAVE INDEX NUMBERS !!!

        System.out.println(Arrays.toString(arr2D[1]));// Print the ARRAY at index 1

        System.out.println((arr2D[2][0]));// Print the element form arrey with index 2 , element 0




    }


}
