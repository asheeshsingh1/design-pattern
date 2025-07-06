package Structural.Composite.Classes;


import Structural.Composite.Interface.FileSystem;

public class File implements FileSystem{

    String fileName;

    public File(String name){
        this.fileName = name;
    }

    @Override
    public void ls() {
        System.out.println("File name is: " + fileName);
    }
    
}
