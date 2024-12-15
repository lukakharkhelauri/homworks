public class Book {
    private String title;
    private int numberOfPages;
    private String author;
    private boolean isHardcover;

    public Book(String title, int numberOfPages, String author, boolean isHardcover) {
        this.title = title;
        this.numberOfPages = numberOfPages;
        this.author = author;
        this.isHardcover = isHardcover;
    }
    public String getTitle() {
        return title;
    }
    public void read() {
        System.out.println("I am reading book: " + title);
    }
    public String toString() {
        return "Book{" + "title='" + title + '\'' + ", numberOfPages=" + numberOfPages + ", author='" + author + '\'' + ", isHardcover=" + isHardcover + '}';
    }
}

class AdventureBook extends Book {
    public AdventureBook(String title, int numberOfPages, String author, boolean isHardcover) {
        super(title, numberOfPages, author, isHardcover);
    }
}
class ScienceBook extends Book {
    private String fieldOfScience;

    public ScienceBook(String title, int numberOfPages, String author, boolean isHardcover, String fieldOfScience) {
        super(title, numberOfPages, author, isHardcover);
        this.fieldOfScience = fieldOfScience;
    }

    public String getFieldOfScience() {
        return fieldOfScience;
    }

    public String toString() {
        return super.toString() + ", fieldOfScience='" + fieldOfScience + '\'';
    }
}

