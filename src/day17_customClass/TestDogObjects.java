package day17_customClass;

public class TestDogObjects {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.name = "Max";
        dog1.breed = "Husky";

        dog1.gender = 'M';
        dog1.age = 4;
        dog1.size = "Large";
        dog1.color = "gray";

        dog1.eat();
        System.out.println(dog1);


        Dog dog2 = new Dog();
        dog2.name = "Loki";
        dog2.breed = "Golden retrivier";
        dog2.age ='F';
        dog2.age = 2 ;


        System.out.println(dog2);




        Dog dog4 = new Dog();
        dog4.setInfo("Chuck", "Bulldog", 'M', 5, "Small", "White");


        System.out.println(dog1);
        System.out.println(dog2);

        System.out.println(dog4);



    }

}
