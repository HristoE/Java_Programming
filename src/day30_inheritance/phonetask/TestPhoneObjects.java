package day30_inheritance.phonetask;

public class TestPhoneObjects {

    public static void main(String[] args) {



        IPhone iphone = new IPhone("Iphone 13","64GB","Silver",1200);
        Samsung samsung = new Samsung("Galaxy S22","Large","White",1300);
        Nokia nokia = new Nokia("Brick", "Small", "Pink", 50);


        iphone.call(911);
        samsung.call(911);
        nokia.call(911);

        iphone.text(123456789);
        samsung.text(123456789);
        nokia.text(123456789);

        System.out.println("-------------------------------");

        iphone.faceTime(123456789);
        //  samsung.faceTime(123456789);
        // nokia.faceTime(123456789);

        samsung.freeze();
        // iphone.freeze();
        //  nokia.freeze();

        nokia.selfDefence();
        //   iphone.selfDefense();
        //   samsung.selfDefense();

        System.out.println("-------------------------------");

        System.out.println(iphone);
        System.out.println(samsung);
        System.out.println(nokia);


    }
}
