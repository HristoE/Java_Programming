package day17_customClass;

public class UniqueCharacter1 {
    public static void main(String[] args) {

        String str = "aabcccd";

        String unique="";

        for (int i = 0; i < str.length(); i++) { // i : is the index number
            char each = str.charAt(i);
            if(str.indexOf(each)== str.lastIndexOf(each)){// that the condition, if the character

                unique += each; // add the character to teh string
            }
        }
        System.out.println(unique);
    }
}
// find the uniq character form the string