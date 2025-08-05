package Behavioral.Iterator.Classes;

import java.util.Arrays;
import java.util.List;

import Behavioral.Iterator.Interface.Iterator;

public class Main {
    public static void main(String[] args) {
        List<Book> bookList = Arrays.asList(
            new Book(100,"Science"),
            new Book(200,"Maths"),
            new Book(200,"English"),
            new Book(200,"Sanskrit"),
            new Book(200,"Socials Science")
        );
        Library lib = new Library(bookList);
        Iterator itr = lib.createIterator();

        while (itr.hasNext()) {
            Book book = (Book) itr.next();
            System.out.println(book.getBookName()+"\t"+book.getPrice());
        }
    }
}
