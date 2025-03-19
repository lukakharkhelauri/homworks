import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        //ex 3
//        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);
//        Stream<Integer> stream = nums
//                .stream()
//                .filter(x -> x > 10)
//                .map(x -> x * x);
//        stream.forEach(System.out::println);

        //ex 2
//        List<String> words = Arrays.asList("jello", "how", "are", "jou");
//        List<String> result = words
//                .stream()
//                .filter(word -> word.toLowerCase().startsWith("j"))
//                .map(String::toUpperCase)
//                .collect(Collectors.toList());
//        result.forEach(System.out::println);

        //3
//        List<String> words = Arrays.asList("Luka", "Andria", "Jumberi", "Valteri", "Rati", "Bero");
//        List<String> sortedWords = words.stream()
//                .sorted()
//                .collect(Collectors.toList());
//        sortedWords.forEach(System.out::println);

        //4
//        List<Human> humans = Arrays.asList(
//                new Human("Giorgi",23),
//                new Human("Daviti",1),
//                new Human("Lexo",1234),
//                new Human("Saba",4),
//                new Human("Levani",90)
//        );
//        List<Human> stream = humans
//                .stream()
//                .filter(human -> human.getAge() >= 15)
//                .toList();
//        stream.forEach(System.out::println);
//
//        Optional<Human> levani = humans.stream()
//                .filter(human -> "Levani".equals(human.getName()))
//                .findFirst();
//        System.out.println(levani.isPresent());

        //5
        
    }
}