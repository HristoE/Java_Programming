package day17_customClass;

public class UniqueCharacter2 {


    public static void main(String[] args) {

        String str = "aabcccd";

        String unique = "";
        for (int j = 0; j < str.length(); j++) {

            char ch = str.charAt(j);
            int frequency = 0;
            for (int i = 0; i < str.length(); i++) {// how many times the char verible  appears in the String str
                if (str.charAt(i) == ch) { // if teh ch has appear in the string
                    frequency++;// increase the frequencey by 1

                }

            }
            if (frequency == 1) { // if the frequency equals to 1 - its unique.
                unique += ch;
            }


        }

        System.out.println(unique);
    }
}