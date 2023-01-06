package day19_array;
import java.util.Arrays;
public class ArraysIntro {
    public static void main(String[] args) {


        int scores[] = new int[5];// 5 is the size of the arrey, 5 elements will be stored ,no more no less
        //  OR  int []scores;

        scores[2]= 78;
        scores[0]=85;
        scores[1]=75;
        scores[3]=88;
        scores[4]=95;
        System.out.println( Arrays.toString(scores));
        System.out.println( scores [2]);// access specific element from array

        for (int i = 0; i < scores.length; i++) {//length- this is the length of the array
            System.out.println( scores [scores.length-1]);//scores.length-1] - last element of the array

        }

    }


}
