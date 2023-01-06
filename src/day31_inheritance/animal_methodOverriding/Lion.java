package day31_inheritance.animal_methodOverriding;

public class Lion extends  Animal{

    private boolean isAfricanlion;

    public Lion(String name, String breed, String size, String color, char gender, int age, boolean isAfricanlion) {
        super(name, breed, size, color, gender, age);
        setAfricanlion(isAfricanlion);
    }

    public boolean isAfricanlion() {
        return isAfricanlion;
    }

    public void setAfricanlion(boolean africanlion) {
        isAfricanlion = africanlion;
    }

    @Override
    public void sleep() {
        System.out.println( " Lion is sleeping at night ");
    }

    @Override
    public void eat() {
        System.out.println( "Lion" + getName() + " is eating rabit  ");
    }


    @Override
    public String toString() {
        return super.toString().replace("}","")+
                ", African Lion=" + isAfricanlion +
                '}';
    }
}
