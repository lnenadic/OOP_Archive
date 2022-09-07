package Rok_1_21.ZD3;

public class TestMain {
    public static void main(String[] args) {
        Author author1 = new Author("AUTHOR-1");
        Author author2 = new Author("AUTHOR-2");
        Books books = new Books();
        Book book = new Book("BOOK-1", author1);
        Book book2 = new Book("BOOK-2", author1);
        Book book3 = new Book("BOOK-3", author2);
        Book book4 = new Book("BOOK-4", author2);
        Book book5 = new Book("BOOK-5", author2);
        Book book6 = new Book("DA", author1);
        books.setAuthor(author1);
        books.addNewBook(book);
        books.addNewBook(book2);
        books.setAuthor(author2);
        books.addNewBook(book3);
        books.addNewBook(book4);
        books.addNewBook(book5);
        books.listAllBooks();

         /*
         System.out.println(" TEST TEST ");
         books.setAuthor(author1);
         books.addNewBook(book6);
         books.listAllBooks();
         */
    }
}
