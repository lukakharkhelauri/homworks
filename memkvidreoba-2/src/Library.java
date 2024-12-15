public class Library {
    private String name;
    private Book[] books;
    private int bookCount = 0;

    public Library(String name, int maxBooks) {
        this.name = name;
        this.books = new Book[maxBooks];
    }

    public void addBook(Book book) {
        if (bookCount < books.length) {
            books[bookCount++] = book;
        } else {
            System.out.println("Cannot add more books.");
        }
    }

    public Book[] getBooks() {
        return books;
    }

    public String toString() {
        return "Library{" +
                "name='" + name + '\'' +
                '}';
    }
}

