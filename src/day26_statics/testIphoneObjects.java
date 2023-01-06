package day26_statics;

public class testIphoneObjects {
    public static void main(String[] args) {

        Iphone iPhone = new Iphone("Iphone12", "Black",1000);


        System.out.println(iPhone.model);
        System.out.println(Iphone.isTouchScreen);
    }
}
