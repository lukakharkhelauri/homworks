import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            //exercise 1
//        Scanner sc = new Scanner(System.in);
//        Random random = new Random();
//        System.out.println("how long array should be?");
//        int length = sc.nextInt();
//        int[] numbers = new int[length];
//        for (int i = 0; i < length; i++) {
//            numbers[i] = random.nextInt(101);
//        }
//
//        while (true) {
//            int sum = 0;
//            for (int i = 0; i < length; i++) {
//                sum += numbers[i];
//            }
//                if (sum == 0) {
//                    System.out.println("All numbers are Zero");
//                    break;
//                }
//            System.out.println("which number should we turn 0?");
//            int numberToTurnZero = sc.nextInt();
//            for (int i = 0; i < length; i++) {
//                if  (numbers[i] == numberToTurnZero) {
//                    numbers[i] = 0;
//                }
//            }
//        }
                    //exercise 2
//                int[] prices = {7, 1, 5, 3, 6, 4};
//
//                if (prices.length == 0) {
//                    System.out.println("No profit");
//                    return;
//                }
//
//                int minprice = prices[0];
//                int maxprofit = 0;
//
//                for (int i = 1; i < prices.length; i++) {
//                    int profit = prices[i] - minprice;
//                    if (profit > maxprofit) {
//                        maxprofit = profit;
//                    }
//
//                    if (prices[i] < minprice) {
//                        minprice = prices[i];
//                    }
//                }
//
//                if (maxprofit > 0) {
//                    System.out.println("Max profit = " + maxprofit);
//                } else {
//                    System.out.println("No profit");
//                }

                    //exercise 3
//                int[] array = {1, 2, 0, 2, 1};
//
//                boolean pal = true;
//                int left = 0;
//                int right = array.length - 1;
//
//                while (left < right) {
//                    if (array[left] != array[right]) {
//                        pal = false;
//                        break;
//                    }
//                    left++;
//                    right--;
//                }
//
//                if (pal) {
//                    System.out.println("Yes");
//                } else {
//                    System.out.println("No");
//                }
            }
        }
