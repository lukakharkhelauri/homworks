public class Main {
    public static void main(String[] args) {

            //exercise 1
        Book book = new Book("harry potter", "J.K. rowling", 359);
        book.displayBookInfo();
        book.addPages(54);
        book.displayBookInfo();

        Rectangle rect = new Rectangle(5, 5);
        rect.displayPerimeter();
        rect.displayArea();
        rect.displayDiagonal();
        rect.displayIsSquare();

        //exercise 5
        Time time = new Time(12,56,42);
        time.displayTimeInfo();

    }
}