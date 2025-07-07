package Creational.Builder.Classes;

public class Main {
    public static void main(String[] args) {
        StudentDirector director1 = new StudentDirector(new EngineerStudentBuilder());
        StudentDirector director2 = new StudentDirector(new MBAStudentBuilder());
        Student engineering = director1.createStudent();
        Student mba = director2.createStudent();

        System.out.println(engineering.toString());
        System.out.println(mba.toString());
    }
}
