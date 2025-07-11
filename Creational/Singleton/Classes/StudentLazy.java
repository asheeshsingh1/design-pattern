package Creational.Singleton.Classes;

import Creational.Singleton.Interface.Student;

public class StudentLazy implements Student{

    String name = "Lazy Student";

    private static StudentLazy studentLazyObject;

    private StudentLazy(){};

    public static StudentLazy getInstance() {
        if(studentLazyObject == null){
            studentLazyObject = new StudentLazy();
        }
        return studentLazyObject;
    }
}
