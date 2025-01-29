import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //exericse 1
//        String input = "this is string exercise in java 1234";
//        int digitCount = 0;
//
//        for (int i = 0; i < input.length(); i++) {
//            char c = input.charAt(i);
//            if (Character.isDigit(c)) {
//                digitCount++;
//            }
//        }
//
//        System.out.println("სტრიქონში ციფრების რაოდენობაა: " + digitCount);

        //exercise 2
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("შეიყვანეთ ტექსტი: ");
//        String input = scanner.nextLine();
//
//        String[] sentences = input.split("[.?!;]");
//        
//        int sentenceCount = 0;
//        for (String sentence : sentences) {
//            if (!sentence.trim().isEmpty()) {
//                sentenceCount++;
//            }
//        }
//
//        System.out.println("წინადადებების რაოდენობა: " + sentenceCount);

        //exercise 3
//        String input = "123321";
//        String cleanedInput = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
//
//        if (isPalindrome(cleanedInput)) {
//            System.out.println("string is a palindrome.");
//        } else {
//            System.out.println("string is not a palindrome.");
//        }
//    }
//    public static boolean isPalindrome(String str) {
//        for (int left = 0, right = str.length() - 1; left < right; left++, right--) {
//            if (str.charAt(left) != str.charAt(right)) {
//                return false;
//            }
//        }
//        return true;

    //exercise 4
//        String input1 = "hello world";
//        String input2 = "hello";
//
//        if (isSubstring(input1, input2)) {
//            System.out.println("input2 არის input1-ის ქვესტრიქონი.");
//        } else {
//            System.out.println("input2 არ არის input1-ის ქვესტრიქონი.");
//        }
//    }
//
//    public static boolean isSubstring(String input1, String input2) {
//        return input1.contains(input2);

        //exercise 5
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("შეიყვანეთ სიტყვა: ");
//        String input = scanner.nextLine();
//
//        char lastChar = input.toLowerCase().charAt(input.length() - 1);
//        if (lastChar == 'a' || lastChar == 'e' || lastChar == 'i' || lastChar == 'o' || lastChar == 'u') {
//            System.out.println("სიტყვა მთავრდება ხმოვნით. \uD83D\uDC4D ");
//        } else {
//            System.out.println("სიტყვა მთავრდება თანხმოვნით. \uD83D\uDC4E");
//        }

        //exercise 7
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("შეიყვანეთ სიტყვა: ");
//        String input = scanner.nextLine();
//
//        if (input.length() >= 10) {
//            String Abbreviation = input.charAt(0) + "" + (input.length() - 2) + input.charAt(input.length() - 1);
//            System.out.println("აბრევეატურა: " + Abbreviation);
//        } else {
//            System.out.println("სიტყვა 10 სიმბოლოზე ნაკლებია");
//        }
    }
}




