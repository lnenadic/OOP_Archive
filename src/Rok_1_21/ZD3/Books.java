package Rok_1_21.ZD3;

import java.util.ArrayList;
import java.util.HashMap;

public class Books {

    private Author author;
    private HashMap<Author, ArrayList<Book>> books;

    public Books() {
        this.books = new HashMap<>();
    }

    public void addNewBook(Book book) {
        if (this.author != null)
            if (books.containsKey(author)) {
                ArrayList<Book> bookArray = books.get(author);
                bookArray.add(book);
                books.put(this.author, bookArray);
            } else {
                ArrayList<Book> bookArray = new ArrayList<>();
                bookArray.add(book);
                books.put(this.author, bookArray);
            }
        else {
            System.out.println("Please set an author.");
        }
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void listAllBooks() {
        for (Author a : books.keySet()) {
            System.out.println("Books of the author - " + a.toString());
            ArrayList<Book> b = books.get(a);
            for (Book book : b) {
                System.out.println(book.toString());
            }
            System.out.println();
        }
    }

}
