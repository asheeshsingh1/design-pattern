package Creational.Singleton.Classes;

import Creational.Singleton.Interface.Student;

public class StudentEager implements Student{

    String name = "Eager Student";

    private StudentEager(){}

    private static StudentEager studentEager = new StudentEager();

    public static StudentEager getInstance() {
        return studentEager;
    }

}