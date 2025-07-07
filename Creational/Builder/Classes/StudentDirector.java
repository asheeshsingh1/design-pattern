package Creational.Builder.Classes;

public class StudentDirector {
    StudentBuilder studentBuilder;

    public StudentDirector(StudentBuilder studentBuilder){
        this.studentBuilder = studentBuilder;
    }

    public Student createStudent(){
        if(studentBuilder instanceof EngineerStudentBuilder){
            return createEngineeringStudent();
        }
        else if(studentBuilder instanceof MBAStudentBuilder){
            return createMBAStudent();
        }
        return null;
    }

    private Student createEngineeringStudent(){
        return studentBuilder.setAge(20)
        .setFatherName("Vijay")
        .setMotherName("Nitu")
        .setName("Asheesh")
        .setRollNo(1)
        .setStandard(12)
        .setSubjects()
        .build();
    }

    private Student createMBAStudent(){
        return studentBuilder.setAge(30)
        .setFatherName("Vijay")
        .setMotherName("Nitu")
        .setName("Abhishek")
        .setRollNo(2)
        .setStandard(15)
        .setSubjects()
        .build();
    }
}
