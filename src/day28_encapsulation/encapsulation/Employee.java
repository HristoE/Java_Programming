package day28_encapsulation.encapsulation;

public class Employee {

private String name;
    private  double salary;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if ( name.isEmpty()|| name.isBlank()){
            System.err.println("Name cannot be empty or blank "  + name);
            System.exit(1);

        }
        this.name = name;
    }

    public double getSalary() {

        return salary;
    }

    public void setSalary(double salary) {
        if ( salary<0){
            System.err.println("Salary cannot be negative "+ salary);
            System.exit(1);
        }
        this.salary = salary;
    }
}
