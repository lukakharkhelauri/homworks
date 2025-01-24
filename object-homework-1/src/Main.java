import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Writer writer1 = new Writer("J.K.", "Rowling");
        Writer writer2 = new Writer("George", "Orwell");

        Book[] books = {
                new Book("Harry Potter 1", 312, "Fantasy", writer1),
                new Book("Harry Potter 2", 213, "Fantasy", writer1),
                new Book("The Great Gatsby", 328, "idk", writer2)
        };

        Fraction[] fractions = {
                new Fraction(1, 2),
                new Fraction(2, 4),
                new Fraction(3, 6),
                new Fraction(1, 3),
                new Fraction(2, 3),
                new Fraction(4, 6)
        };

        System.out.println("Fractions in the array:");
        for (Fraction fraction : fractions) {
            System.out.println(fraction);
        }

        int equalCount = 0;
        for (int i = 0; i < fractions.length; i++) {
            for (int j = i + 1; j < fractions.length; j++) {
                if (fractions[i].equals(fractions[j])) {
                    equalCount++;
                }
            }
        }

        System.out.println("Number of equal fractions in the array: " + equalCount);

    }
}