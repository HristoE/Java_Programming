package day24_dateAndTime;

import java.time.LocalDate;

public class LocalDateIntro {

    public static void main(String[] args) {


        LocalDate today = LocalDate.now();

        System.out.println(today);


        LocalDate birthday = LocalDate.of(2000,6,23);

        System.out.println(birthday);
    }
}
