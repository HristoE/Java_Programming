package day27_acessModifiers;

public class InstanceBlock {
    {
        System.out.println("Instance block ");
    }

public InstanceBlock(){
    System.out.println( "Constructor");
}
    public static void main(String[] args) {
new InstanceBlock();
    }
}
