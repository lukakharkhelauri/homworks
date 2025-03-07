import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        //1
//        ArrayList<Integer> numbers = new ArrayList<>();
//        Random random = new Random();
//
//        while (!numbers.contains(40)) {
//            numbers.add(random.nextInt(51));
//        }
//        System.out.println(numbers.size() + ", " + numbers);
//
//        ArrayList<Integer> oddNumbers = new ArrayList<>();
//        for (int num : numbers) {
//            if (num % 2 != 0) {
//                oddNumbers.add(num);
//            }
//        }
//        System.out.println(oddNumbers.size() + ", " + oddNumbers);

        //2
//        ArrayList<Integer> numbers = new ArrayList<>();
//        Random random = new Random();
//
//        while (!numbers.contains(20)) {
//            numbers.add(random.nextInt(21));
//            if (numbers.contains(20)) {
//                System.out.println("List of { " + numbers + " }.");
//            }
//        }

        //3
//        ArrayList<Integer> numbers = new ArrayList<>();
//        Random random = new Random();
//        int[] numberz = new int[5];
//        for (int i = 0; i < numberz.length; i++) {
//            numberz[i] = random.nextInt(51);
//        }
//        for (int num : numberz) {
//            numbers.add(num);
//        }
//
//        System.out.println(numbers);
//
//        int maxIndex = 0;
//        for (int i = 1; i < numbers.size(); i++) {
//            if (numbers.get(i) > numbers.get(maxIndex)) {
//                maxIndex = i;
//            }
//        }
//
//        System.out.println("Max number index: " + maxIndex);

        Library library = new Library();
        try {
            library.populateList("src/books.txt");
            for (Book book : library.getBooks()) {
                System.out.println(book);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

    }
}