public class Book {
    String title;
    String author;
    int pages;

    Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    void addPages(int number) {
        pages += number;
    }

    void displayBookInfo() {
        System.out.println("book: {");
        System.out.println("\tTitle: " + title);
        System.out.println("\tAuthor: " + author);
        System.out.println("\tPage: " + pages);
        System.out.println("}");
    }
}
