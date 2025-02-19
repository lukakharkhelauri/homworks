import java.io.*;
import java.util.Scanner;

public class Main {
    private static final String FILE_NAME = "countries.txt";
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Country[] countries = new Country[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter country " + (i + 1) + " details:");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Population: ");
            int population = scanner.nextInt();
            System.out.print("Area: ");
            double area = scanner.nextDouble();
            scanner.nextLine();
            countries[i] = new Country(name, population, area);
        }

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(countries);
            System.out.println("serialized successfully.");
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
        
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            Country[] deserializedCountries = (Country[]) ois.readObject();
            System.out.println("\nDeserialized countries:");
            for (Country country : deserializedCountries) {
                System.out.println(country);
            }
        } catch (IOException | ClassNotFoundException e) {
            System.err.println(e.getMessage());
        }

    }
}