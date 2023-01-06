package day20_forEach;

public class ForEachLoopPractice {


    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

        for (int each : numbers) {
            if (each % 2 != 0) {
                System.out.println(each);
            }
        }
        System.out.println(" -----------------------");
        int[] nums = {100, 20, 30, 80, 6};
        int max = nums[0];
        int min = nums[0];


        for (int each : nums) {
            if (each > max) {
                max = each;
            }
            if (each<min){
                min=each;
            }

        }

        System.out.println("max= " +max);
        System.out.println("min = +min");
    }
}
