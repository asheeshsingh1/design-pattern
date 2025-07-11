package Creational.Prototype.Classes;

import Creational.Prototype.Interface.Prototype;

public class Student implements Prototype{
    String name;
    int age;
    private int rollNumber;

    Student(){}

    Student(int age,int rollNumber,String name){
        this.age = age;
        this.name = name;
        this.rollNumber = rollNumber;
    }

    @Override
    public Prototype clone(){
        return new Student(age,rollNumber,name);
    }
}
