import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 1) b) -3
        // 2) c) int[] array = new int[5][5];
        // 3) d) 4
        // 4) c) String
        // 5) a) A
        // 6) c) byte, short, int, long
        // 7) d) არცერთი
        // 8) a) break;
        // 9) a) აცხადებს 10 ინტიან მასივს და ყველას ანიჭებს მნიშვნელობას 0;
        // 10) c) 24
        // 11) c) მასივს აქვს ფიქსირებული ზომა
        // 12) c) git log
        // 13) a) Remote რეპოზიტორის ასლს ქმნის ლოკალურად
        // 14) a) 0
        // 15) c) მასივს მხოლოდ რიცხვობრივი მნიშვნელობის შენახვა შეუძლია

        // 16)

//        int[] prices = {1,5,9,2,10,7};
//        String[] stores = {"Store 1", "Store 2", "Store 3", "Store 4", "Store 5", "Store 6"};
//
//        int maxPrice = prices[0];
//        int minPrice = prices[0];
//        int minIndex = 0;
//        int maxIndex = 0;
//
//        for (int i = 1; i < prices.length; i++) {
//            if(prices[i] < minPrice) {
//                minPrice = prices[i];
//                minIndex = i;
//            }
//            if (prices[i] > maxPrice) {
//                maxPrice = prices[i];
//                maxIndex = 1;
//            }
//        }
//
//        System.out.println("cheapest " + stores[minIndex] + " price is " + minPrice);
//        System.out.println("most expensive" + stores[maxIndex] + " price is " + maxPrice);

        // 17)

//        for (int i = 0; i <= 100; i++) {
//            if(i % 5 == 0) {
//                System.out.println("HEY");
//            } else if(i % 7 == 0) {
//                System.out.println("HOW");
//            } else if(i % 5 == 0 && i % 7 == 0) {
//                System.out.println("HEYHOW");
//            } else {
//                System.out.println(i);
//            }
//        }

        // 18)

//        Scanner scanner = new Scanner(System.in);
//        Random random = new Random();
//
//        System.out.print("enter rows:");
//        int rows = scanner.nextInt();
//        System.out.print("enter columns:");
//        int columns = scanner.nextInt();
//        int[][] array = new int[rows][columns];
//
//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < columns; j++) {
//                array[i][j] = random.nextInt(101);
//            }
//        }
//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < columns; j++) {
//                System.out.println(array[i][j]);
//            }
//        }
//
//        int max = array[0][0];
//        int min = array[0][0];
//        int minRow = 0;
//        int minColumn = 0;
//        int maxRow = 0;
//        int maxColumn = 0;
//
//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < columns; j++) {
//                if(array[i][j] < min) {
//                    min = array[i][j];
//                    minRow = i;
//                    minColumn = j;
//                } if (array[i][j] > max) {
//                    max = array[i][j];
//                    maxRow = i;
//                    maxColumn = j;
//                }
//            }
//        }
//        System.out.println("Smallest: " + min + "[" + minRow + "]" + "[" + minColumn + "]");
//        System.out.println("Largest: " + max + "[" + maxRow + "]" + "[" + maxColumn + "]");

        //19

//        Scanner scanner = new Scanner(System.in);
//        Random random = new Random();
//
//        System.out.print("enter rows:");
//        int rows = scanner.nextInt();
//        System.out.print("enter columns:");
//        int columns = scanner.nextInt();
//        int[][] array = new int[rows][columns];
//        int diagonal = 0;
//
//        if (rows != columns) {
//            System.out.println("error");
//            return;
//        }
//
//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < columns; j++) {
//                array[i][j] = random.nextInt(101);
//            }
//        }
//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < columns; j++) {
//                System.out.println(array[i][j]);
//            }
//        }
//
//        for (int i = 0; i < rows; i++) {
//            diagonal += array [i][i];
//            diagonal += array[i][columns - i - 1];
//        }
//
//        if (rows % 2 != 0) {
//            int middle = rows / 2;
//            diagonal -= array[middle][middle];
//        }
//
//        System.out.println("sum of both diagonals " + diagonal);

        //20



    }
}