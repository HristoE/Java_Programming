package day33_abstraction.employeeTask;

public class TestEmployeeObjects {
    public static void main(String[] args) {

        Tester tester1 = new Tester(" Tamara", 25,'F',"A11","SDET",100000);


        System.out.println(tester1);

        tester1.work();

    }
}
