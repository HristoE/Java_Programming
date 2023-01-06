package day14_forLoop;

public class ForLoopPractice {

    public static void main(String[] args) {



      for (int i=10 ;i >=5;  i--)  {

          System.out.println("Hello Cydeo" + i);
      }


      // sum of all the number 1~100

        int sum = 0;

        for (int i = 1; i <=100; i++){
            sum += i;

        }
        System.out.println(sum);



        // print all alphabet letterA~Z

        for (char i= 'A'; i<= 'Z';i++){
            System.out.print(i +" ");

        }


    }

}
