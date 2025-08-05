package Behavioral.Iterator.Classes;

import java.util.List;

import Behavioral.Iterator.Interface.Aggregate;
import Behavioral.Iterator.Interface.Iterator;

public class Library implements Aggregate{
    private List<Book> bookList;

    public Library(List<Book> bookList){
        this.bookList = bookList;
    }

    @Override
    public Iterator createIterator() {
       return new BookIterator(bookList);
    }

}
