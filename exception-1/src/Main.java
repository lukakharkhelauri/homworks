import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //exercise 1
//        try {
//            System.out.print("შეიყვანეთ რიცხვი: ");
//            int number1 = scanner.nextInt();
//
//            System.out.print("შეიყვანეთ რიცხვი: ");
//            int number2 = scanner.nextInt();
//
//            int result = number1 / number2;
//            System.out.println("რეზულტატი: " + result);
//
//        } catch (ArithmeticException | InputMismatchException e) {
//            System.out.println("ციფრი ან რიცხვი იყო გაყოფილი 0-ზე ან არ იყო ჩაწერილი სწორი char-ი");
//        }
//      System.out.println("important code");

        //exercise 2
//        try {
//            System.out.print("შეიყვანეთ რიცხვი: ");
//            String input = scanner.nextLine();
//            int number = Integer.parseInt(input);
//
//            int result = number / 100;
//            System.out.println("result " + result);
//
//        }catch(ArithmeticException | NumberFormatException e) {
//            System.out.println("უნდა ჩაიწეროს ციფრი ან რიცხვი უნდა  და იყოს მთელი");
//        }

        //exercise 3
//        int[] numbers = {10, -5, 20, -1, 30};
//
//        for (int num : numbers) {
//            try {
//                if (num < 0) {
//                    throw new NegativeNumberException("უარყოფითი რიცხვები დაუშვებელია: " + num);
//                }
//            } catch (NegativeNumberException e) {
//                System.out.println("Exception caught: " + e.getMessage());
//            }
//        }

        try {
            double number = -25;
            double result = SquareRootCalculator.calculateSquareRoot(number);
            System.out.println("The square root is: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}