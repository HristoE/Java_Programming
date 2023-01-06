package day19_array;

import java.util.Arrays;

public class ArrayPractice1 {

    public static void main(String[] args) {



        String myGroup []=new String[5];
        myGroup[0]="Gulcen";
        myGroup[myGroup.length-1]= "Assel";
        myGroup [2]="Sumeve";
        myGroup[1]= "Abudullah";
        myGroup[3]= "Khashayar";

        System.out.println(Arrays.toString(myGroup));

        myGroup[1]="Kuzzat";
        System.out.println(Arrays.toString(myGroup));


        for (int i = myGroup.length-1; i >=0 ; i--) {
            System.out.println(myGroup[i]);

            for (int i1 = 0; i1 < myGroup.length; i1++) {


                for (int i2 = myGroup.length - 1; i2 >= 0; i2--) {
                    
                }
            }

        }




    }





}
