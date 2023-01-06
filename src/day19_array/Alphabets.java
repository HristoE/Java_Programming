package day19_array;

import java.util.Arrays;

public class Alphabets {
    public static void main(String[] args) {

        char[] ascending = new char[26];// index;0~25, 26 letter in the alphabet
        char[]descending = new char[26];


        for (int i = 0, j = 'A',k='Z'; i < ascending.length; i++, j++,k--) {
            ascending[i] = (char) j;
            descending [i] = (char) k;
        }





        System.out.println(Arrays.toString(ascending));
        System.out.println(Arrays.toString(descending));


    }


}
