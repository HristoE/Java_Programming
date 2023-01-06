package day27_acessModifiers;

public class TestCydeoStudentObject {

    public static void main(String[] args) {


        CydeoStudent student1 = new CydeoStudent("John", 33, 'M');

        CydeoStudent student2 = new CydeoStudent("Kal", 32, 'F');

        System.out.println(student1);
        System.out.println(student1.schoolName);
    }
}