package day17_customClass;

public class TestEmployeeObjects {
    public static void main(String[] args) {


        Employee employee1 = new Employee();
        employee1.setInfo("John",45,'F',"SDET",87000,"87");

        Employee employee2 = new Employee();
        employee2.setInfo("Khashayar", 29, 'M', "Back-end Developer", 98000, "B13");

        Employee employee3 = new Employee();
        employee3.setInfo("Abidullah", 30, 'M', "Front-end Developer", 99000, "C14");


        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);

employee1.work();
    }





}
