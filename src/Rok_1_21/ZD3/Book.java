package Rok_1_21.ZD3;

public class Book {

    private int id;
    private static int cnt = 0;
    private String title;
    Author author;

    public Book(String title, Author author) {
        this.title = title;
        this.author = author;
        cnt++;
        this.id = cnt;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author=" + author +
                '}';
    }
}
