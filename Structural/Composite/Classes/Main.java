package Structural.Composite.Classes;

import Structural.Composite.Interface.FileSystem;

public class Main {
    public static void main(String[] args) {
        
        Directory movieDirectory = new Directory("Movie");
        FileSystem border = new File("Border");
        movieDirectory.add(border);

        Directory comedyMovieDirectory = new Directory("ComedyMovie");
        FileSystem gadar = new File("Gadar");
        comedyMovieDirectory.add(gadar);

        movieDirectory.add(comedyMovieDirectory);
        
        movieDirectory.ls();        
    }
}
