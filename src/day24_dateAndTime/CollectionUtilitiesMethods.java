package day24_dateAndTime;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionUtilitiesMethods {


    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Java", "Java", "Java", "C#", "C#", "Ruby", "Swift", "Swift", "Java"));

        Collections.replaceAll(names, "Java", "Pyton");

        System.out.println(names);
        System.out.println("____________________");

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10, 20, 20, 30, 40, 40, 40, 50, 50, 50, 50));

        int count = Collections.frequency(list, 50);
        System.out.println(count);


        System.out.println("-----------------");

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(10, 20, 20, 30, 40, 40, 40, 50, 50, 50, 50, 50, 50));

        for (Integer each : numbers) {
            if (Collections.frequency(numbers, each) == 1) {
                System.out.println(each);
            }


        }
    }
}