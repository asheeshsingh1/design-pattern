package Structural.Composite.Classes;

import java.util.ArrayList;
import java.util.List;

import Structural.Composite.Interface.FileSystem;

public class Directory implements FileSystem{

    String directoryName;
    List<FileSystem> fileSystemList;

    public Directory(String name){
        this.directoryName = name;
        fileSystemList = new ArrayList<>();
    }

    public void add(FileSystem fileSystem){
        fileSystemList.add(fileSystem);
    }

    @Override
    public void ls() {
        System.out.println("Directory name: " + directoryName);

        for(FileSystem fileSystemObj:fileSystemList){
            fileSystemObj.ls();
        }
    }
    
}
