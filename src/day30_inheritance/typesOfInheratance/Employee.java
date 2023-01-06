package day30_inheritance.typesOfInheratance;

import java.time.LocalDate;
import java.util.SortedMap;

public class Employee  extends Person{


    private String jobTitle;
    private String employeeId;
    private double  Salary;

    public Employee(String name, char gender, LocalDate DOB, String jobTitle, String employeeId, double salary) {
        super(name, gender, DOB);
        setJobTitle(jobTitle);
        setEmployeeId( employeeId);
       setSalary(salary);
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }

    public void work (){
        System.out.println(getName() + " is working ");
    }


}
