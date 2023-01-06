package day22_ArrayList;

import java.util.ArrayList;

public class ArrayListMethods {
    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);// add - will add element to the list
        list.add(33);
        list.add(36);
        System.out.println(list);

        list.add(2,3);// second add method - will add the element to specific index number !!!

        System.out.println(list);

        System.out.println("- -------------------------");

        ArrayList <String> studentList = new ArrayList<>();
        studentList.add("Hristo");
        studentList.add ("Stoli");
        studentList.add("Muhtar");

        System.out.println(studentList.size());
        System.out.println(studentList);
        String firstStudentName = studentList.get(0);

String lastStudent= studentList.get(studentList.size()-1);// last index of the arraylist
        System.out.println(firstStudentName);
        System.out.println(lastStudent);

    }
}
