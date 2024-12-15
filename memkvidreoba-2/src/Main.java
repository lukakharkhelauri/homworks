public class Main {
    public static void main(String[] args) {
        Library library = new Library("City Library", 5);

        Book book1 = new AdventureBook("The Adventures of Tom Sawyer", 300, "Mark Twain", true);
        Book book2 = new ScienceBook("A Brief History of Time", 256, "Stephen Hawking", false, "Physics");

        library.addBook(book1);
        library.addBook(book2);

        BookAdvisor advisor = new BookAdvisor("Anamaria", "Cvariani", 101, "City Library", 4.5, library.getBooks());
        SilenceController controller = new SilenceController("Andria", "Butulashvili", 102, 8.5);
        Bookkeeper bookkeeper = new Bookkeeper("Gio", "Gegelashvili", 103);

        System.out.println(library);

        System.out.println("Recommended book: " + advisor.recommendBook());
        System.out.println(bookkeeper);
        System.out.println(advisor);
        System.out.println(controller);
    }
}