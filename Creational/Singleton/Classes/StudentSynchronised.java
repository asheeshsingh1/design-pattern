package Creational.Singleton.Classes;

import Creational.Singleton.Interface.Student;

public class StudentSynchronised implements Student{

    String name = "Synchronised Student";

    private static StudentSynchronised studentSynchronisedObject;

    private StudentSynchronised(){};

    synchronized public static StudentSynchronised getInstance() {
        if(studentSynchronisedObject == null){
            studentSynchronisedObject = new StudentSynchronised();
        }
        return studentSynchronisedObject;
    }
}