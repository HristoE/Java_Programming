package day38_exceptions;




class CustomCheckedExceptions extends Exception{}


class CustomUncheckedExceptions extends RuntimeException{

}


public class CustomExceptions {
    public static void main(String[] args) {

        try {
            throw new CustomCheckedExceptions();
        } catch (CustomCheckedExceptions e) {
            throw new RuntimeException(e);
        }
    }
}
