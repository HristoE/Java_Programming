package day25_constructor;

import java.time.LocalDate;

public class TestEmployeeObject {


    public static void main(String[] args) {


        Employee e1 = new Employee("John",34,'M',"Java Sdet ",89000, LocalDate.of(2022,3,11));
        System.out.println(e1);

    }
}
