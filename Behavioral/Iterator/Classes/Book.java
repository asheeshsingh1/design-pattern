package Behavioral.Iterator.Classes;

public class Book {
    private String bookName;
    private Integer price;

    Book(int price,String bookName){
        this.bookName = bookName;
        this.price = price;
    }

    public String getBookName() {
        return bookName;
    }

    public Integer getPrice() {
        return price;
    }
}
