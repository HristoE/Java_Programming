package utilities;

import day27_acessModifiers.Data;

public class Test {

    public static void main(String[] args) {

        System.out.println(Data.d);
        System.out.println(Data.e);
        System.out.println(Data.f);
        Data.method3();
        Data.method4();



        Data obj = new Data();

        System.out.println(Data.d);
        System.out.println(Data.e);
        System.out.println(Data.f);
        Data.method3();
        Data.method4();

    }
}
