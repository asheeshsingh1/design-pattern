package Creational.Prototype.Classes;

public class Main {
    public static void main(String[] args) {
        Student student = new Student(10,20,"Asheesh");
        Student cloneObject = (Student) student.clone();
        System.out.println(cloneObject.name);
        System.out.println(cloneObject.age);
    }
}
