package day23_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayArrayListConversion {

    public static void main(String[] args) {

        String [] arr = {"A","B","C"};
        ArrayList<String>list = new ArrayList<>(Arrays.asList(arr));

      String [] languages = list.toArray(list.toArray(new String[0]));



    }
}
