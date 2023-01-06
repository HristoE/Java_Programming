package day20_forEach;

import utilities.ArraysUtility;

import java.util.Arrays;
import java.util.SortedMap;

public class StringMethods {

    public static void main(String[] args) {

        String str = "Cydeo School";
        //char[]ch= str.toCharArray();// display all char characters including space
        char[] ch = str.replace(" ", "").toCharArray();
        System.out.println(Arrays.toString(ch));

        String str2 = "Today is a great day to fuck up  ";

        String[] words = str2.split(" ");
        System.out.println(Arrays.toString(words));


        String sentence = "I love Java";
        sentence.split(" ");// this will give us array [ i ,love, Java]

       String [] arr = ArraysUtility.reverse(sentence.split(" "));

        System.out.println( Arrays.toString(arr));

String reverseSentence = "";
        for (int i = 0; i < arr.length; i++) {
            reverseSentence+=arr[i]+" ";

        }

        System.out.println(reverseSentence);
    }


}
