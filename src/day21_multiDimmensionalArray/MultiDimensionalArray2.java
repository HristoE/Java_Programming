package day21_multiDimmensionalArray;

import java.util.Arrays;

public class MultiDimensionalArray2 {


    public static void main(String[] args) {


        int[][] arr2D1 = {{1, 2}, {3, 4, 5,}};
        int[][] arr2D2 = {{6, 7, 8,}, {3, 4, 5,}, {12, 13, 14}};
        int[][] arr2D3 = {{15, 16, 17}};


        int[][][] arr3D = {{{1, 2}, {3, 4, 5,}}, {{6, 7, 8,}, {3, 4, 5,}, {12, 13, 14}}, {{15, 16, 17}}};

        System.out.println(Arrays.deepToString(arr3D));

        System.out.println(Arrays.deepToString(arr3D[1]));// deep to String - to displays arrays

        System.out.println(Arrays.toString(arr3D[0][1]));// toString - to display single arrays

        System.out.println(Arrays.toString(arr3D[1][0]));


        System.out.println(arr3D[1][2][1]); // to print element  of single array


        for (int i = 0; i < arr3D.length; i++) { //i: index of number of each 2 dimensional array
            int[][] each2DArray = arr3D[i];
            System.out.println(Arrays.deepToString(each2DArray));

            for (int j = 0; j < each2DArray.length; j++) { // j: index number of each 1 dimensional array
                int[] each1DArray = each2DArray[j];
                System.out.println(Arrays.toString(each1DArray));

                for (int k = 0; k < each1DArray.length; k++) { // k: index number of each element
                    int eachElement = each1DArray[k];
                    System.out.println(eachElement);
                }

            }

        }
    }
}