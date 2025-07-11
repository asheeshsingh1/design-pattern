package Creational.Singleton.Classes;

import Creational.Singleton.Interface.Student;

public class StudentDoubleLock implements Student{
    String name = "Double Lock Student";

    private StudentDoubleLock(){};

    private static StudentDoubleLock studentDoubleLockObject;

    synchronized public static StudentDoubleLock getInstance(){
        if(studentDoubleLockObject == null){
            synchronized(StudentDoubleLock.class){
                if(studentDoubleLockObject == null){
                    studentDoubleLockObject = new StudentDoubleLock();
                }
            }
        }
        return studentDoubleLockObject;
    }
}
