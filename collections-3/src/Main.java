import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        //სავარჯიშო 1
        ArrayList<BasketballPlayer> players = new ArrayList<>();
        players.add(new BasketballPlayer("LeBron", "James", 25, 8, 1, 10, 3));
        players.add(new BasketballPlayer("Stephen", "Curry", 30, 5, 0, 8, 2));
        players.add(new BasketballPlayer("Luka", "Doncic", 28, 12, 2, 6, 4));
        players.add(new BasketballPlayer("Kevin", "Durant", 27, 7, 1, 5, 3));

        Collections.sort(players, Comparator.comparingDouble(BasketballPlayer::calculateRating).reversed());
        for (BasketballPlayer player : players) {
            System.out.println(player);
        }

        Collections.sort(players, Comparator.comparingDouble(BasketballPlayer::calculateRating));
        for (BasketballPlayer player : players) {
            System.out.println(player);
        }

        //სავარჯიშო 2
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Luka", "Kharkhelauri", new GregorianCalendar(2009, Calendar.JANUARY, 16).getTime(), new ArrayList<>(Arrays.asList(85, 90, 78))));
        students.add(new Student("Davit", "Maisuradze", new GregorianCalendar(2004, Calendar.JUNE, 22).getTime(), new ArrayList<>(Arrays.asList(92, 88, 95))));
        students.add(new Student("Aleksandre", "Tnadliashvili", new GregorianCalendar(2006, Calendar.MARCH, 5).getTime(), new ArrayList<>(Arrays.asList(70, 75, 80))));

        // 1) დაულაგებელი სია
        System.out.println("Unsorted List:");
        for (Student student : students) {
            System.out.println(student);
        }
        // 2) ანბანის მიხედვით
        students.sort(Comparator.comparing(Student::getFullName));
        System.out.println("\nSorted Lexicographically:");
        for (Student student : students) {
            System.out.println(student);
        }
        // 3) საშუალო ქულების მიხედვით
        students.sort(Comparator.comparingDouble(Student::calculateAverageGrade).reversed());
        System.out.println("\nSorted by Average Grade:");
        for (Student student : students) {
            System.out.println(student);
        }
        // 4)თარიღის მიხედვით
        students.sort(Comparator.comparing(Student::getBirthDate));
        System.out.println("\nSorted by Birth Date:");
        for (Student student : students) {
            System.out.println(student);
        }

        //სავარჯიშო 3
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("Toyota", "Corolla", 2015, 120000, new Engine("Petrol", 4, 1.8)));
        cars.add(new Car("BMW", "M3", 2018, 80000, new Engine("Petrol", 6, 3.0)));
        cars.add(new Car("Ford", "Focus", 2012, 150000, new Engine("Diesel", 4, 2.0)));
        cars.add(new Car("Mercedes", "C-Class", 2020, 50000, new Engine("Petrol", 4, 2.0)));

        // 1) დაულაგებელი სია
        System.out.println("Unsorted List:");
        for (Car car : cars) {
            System.out.println(car);
        }

        // 2)გამოშვების წელი
        cars.sort(Comparator.comparingInt(Car::getYear));
        System.out.println("\nSorted by Year:");
        for (Car car : cars) {
            System.out.println(car);
        }

        // 3)გარბენი
        cars.sort(Comparator.comparingInt(Car::getMileage));
        System.out.println("\nSorted by Mileage:");
        for (Car car : cars) {
            System.out.println(car);
        }

        // 4)ძრავა
        cars.sort(Comparator.comparingDouble(Car::getEngineCapacity));
        System.out.println("\nSorted by Engine Capacity:");
        for (Car car : cars) {
            System.out.println(car);
        }

    }
}

