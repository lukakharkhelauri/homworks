public class BookAdvisor extends Consultant{
    private String libraryName;
    private double recommendationRating;
    private Book[] libraryBooks;

    public BookAdvisor(String firstName, String lastName, int id, String libraryName, Book[] libraryBooks) {
        super(firstName, lastName, id);
        this.libraryName = libraryName;
        this.libraryBooks = libraryBooks;
    }

    public String recommendBook() {
        return  "Name: Harry Potter Author: J.K. rowling NumberOfPages: 456 isHardCover: false";
    }
}
