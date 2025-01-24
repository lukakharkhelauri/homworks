import java.util.Objects;

public class Book {
    private String title;
    private int numberOfPages;
    private String genre;
    private Writer author;

    public Book(String title, int numberOfPages, String genre, Writer author) {
        this.title = title;
        this.numberOfPages = numberOfPages;
        this.genre = genre;
        this.author = author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return numberOfPages == book.numberOfPages && Objects.equals(title, book.title) && Objects.equals(genre, book.genre) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, numberOfPages, genre, author);
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", numberOfPages=" + numberOfPages +
                ", genre='" + genre + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
