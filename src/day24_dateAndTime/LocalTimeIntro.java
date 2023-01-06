package day24_dateAndTime;

import java.time.LocalTime;

public class LocalTimeIntro {
    public static void main(String[] args) {

        LocalTime starting_time= LocalTime.of(10,20);
        System.out.println(starting_time);
        LocalTime rightNow = LocalTime.now();
        System.out.println(rightNow);



    }
}
