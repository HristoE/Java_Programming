package day31_inheritance.animal_methodOverriding;

import java.util.Set;

public class Animal {
    private String name, breed, size, color;
    private char gender;
    private int age;

    public Animal(String name, String breed, String size, String color, char gender, int age) {
        setName(name);
        setBreed(breed);
        setAge(age);
        setSize(size);
        setColor(color);
        setGender(gender);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public void drink(){
        System.out.println(name + "is drinking water ");
    }
    public void eat(){
        System.out.println(name + " is eating ");
    }
    public void sleep(){
        System.out.println(name + "is sleeping");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+"{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }
}