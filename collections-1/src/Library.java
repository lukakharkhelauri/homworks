import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    public void populateList(String fileName) throws IOException {
        books = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] bookInfo = line.split(" ");
                String name = bookInfo[0];
                int pages = Integer.parseInt(bookInfo[1]);
                Book book = new Book(name, pages);
                books.add(book);
            }
        }
    }
}
