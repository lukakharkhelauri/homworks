import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Human person1 = new Human("Giorgi", "asanishvili", 17 );
        Human person2 = new Human("Aleksandre", "tandilashvili", 18);

        person1.walk();
        person1.hangOut(person2);

        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter name, surname, and age:");
            String name = scanner.next();
            String surname = scanner.next();
            int age = scanner.nextInt();

            Human person = new Human(name, surname, age);
            person.walk();
            System.out.println("Created Human: " + person.getFirstName() + " " + person.getSecondName() + ", Age: " + person.getAge());

            scanner.close();
        } catch(InputMismatchException e) {
            System.out.println("Input mismatch ❌");
        }
    }
}