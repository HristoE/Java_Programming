package day30_inheritance.typesOfInheratance;

import java.time.LocalDate;

public class Student extends Person{

    private char grade;
    private String StudentId;

    public Student(String name, char gender, LocalDate DOB, char grade, String studentId) {
        super(name, gender, DOB);
        setGrade(grade);
        getStudentId(StudentId);
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    public String getStudentId(String studentId) {
        return StudentId;
    }

    public void setStudentId(String studentId) {
        StudentId = studentId;
    }

    public void study(){

    };

}
