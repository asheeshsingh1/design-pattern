package Creational.Builder.Classes;

import java.util.List;

public class Student {
    
    public int rollNo;
    public String name;
    public String motherName;
    public String fatherName;
    public int age;
    public int standard;
    List<String> subjects;

    public Student(StudentBuilder studentBuilder){
        this.rollNo = studentBuilder.rollNo;
        this.name = studentBuilder.name;
        this.motherName = studentBuilder.motherName;
        this.fatherName = studentBuilder.fatherName;
        this.age = studentBuilder.age;
        this.standard = studentBuilder.standard;
        this.subjects = studentBuilder.subjects;
    }    

    @Override
    public String toString() {
        return 
                "" + " Roll Number: " + this.rollNo +
                " Name: " + this.name +
                " Age: " + this.age +
                " Father' Name: " + this.fatherName +
                " Mother's Name: " + this.motherName +
                " Standard: " + this.standard +
                " Subjects: " + subjects.get(0) + "," + subjects.get(1);

    }
}
