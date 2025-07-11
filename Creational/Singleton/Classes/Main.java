package Creational.Singleton.Classes;

public class Main {
    public static void main(String[] args) {
        // Object created through Eager Approach
        StudentEager objectStudentEager = StudentEager.getInstance();
        System.out.println("Student name: " + objectStudentEager.name);

        StudentLazy objectStudentLazy = StudentLazy.getInstance();
        System.out.println("Student name: " + objectStudentLazy.name);

        StudentSynchronised objectStudentSynchronised = StudentSynchronised.getInstance();
        System.out.println("Student name: " + objectStudentSynchronised.name);

        StudentDoubleLock objectStudentDoubleLock = StudentDoubleLock.getInstance();
        System.out.println("Student name: " + objectStudentDoubleLock.name);
    }
}
