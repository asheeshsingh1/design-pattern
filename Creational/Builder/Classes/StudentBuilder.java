package Creational.Builder.Classes;

import java.util.List;

public abstract class StudentBuilder {
    public int rollNo;
    public String name;
    public String motherName;
    public String fatherName;
    public int age;
    public int standard;
    List<String> subjects;
    
    public StudentBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public StudentBuilder setFatherName(String fatherName) {
        this.fatherName = fatherName;
        return this;
    }

    public StudentBuilder setMotherName(String motherName) {
        this.motherName = motherName;
        return this;
    }

    public StudentBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public StudentBuilder setRollNo(int rollNo) {
        this.rollNo = rollNo;
        return this;
    }

    public StudentBuilder setStandard(int standard) {
        this.standard = standard;
        return this;
    }

    abstract public StudentBuilder setSubjects();

    public Student build(){
        return new Student(this);
    }
}
