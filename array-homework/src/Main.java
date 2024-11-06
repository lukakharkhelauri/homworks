import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //exercise 1
//       int[] b = new int[12];
//
//        for (int i = 0; i < b.length; i++) {
//            b[i] = i * i;
//        }
//        for (int i = 0; i < b.length; i++) {
//            System.out.println("b[" + i + "] = " + b[i]);
//        }

        //exercise 2
//        int sum = 0;
//        int product = 1;
//        for (int i = 0; i < b.length; i++) {
//            sum += b[i];
//            product *= b[i];
//        }
//
//        double mean = (double) sum / b.length;
//
//        System.out.println("Sum = " + sum);
//        System.out.println("Product = " + product);
//        System.out.println("Arithmetic  = " + mean);

        //exercise 6
//        int[] b = new int[5];
//        int x = 4;
//
//        for (int i = 0; i < b.length; i++) {
//            b[i] = i * i;
//        }
//
//        boolean found = false;
//        for (int value : b) {
//            if (value == x) {
//                found = true;
//                break;
//            }
//        }
//
//        if (found) {
//            System.out.println(x + " is in array");
//        } else {
//            System.out.println(x + " is not in array");
//        }

        //exercise 3
//        int[] b = new int[20];
//        Random random = new Random();
//
//        for (int i = 0; i < b.length; i++) {
//            b[i] = random.nextInt(21);
//        }
//
//        System.out.println("Array elements:");
//        for (int value : b) {
//            System.out.print(value + " ");
//        }
//
//        int max = b[0];
//        int min = b[0];
//
//        for (int value : b) {
//            if (value > max) {
//                max = value;
//            }
//            if (value < min) {
//                min = value;
//            }
//        }
//        System.out.println("Maximum value: " + max);
//        System.out.println("Minimum value: " + min);

        //exercise 4
//        int[] array = new int[15]; //ეს გამოვიყენე შემდეგ ამოცანაში
//
//        for (int i = 0; i < array.length; i++) { //ესეც გამოვიყენე შემდეგ ამოცანაში
//            array[i] = i + 1;
//        }
//
//        System.out.println("elements:");
//        for (int value : array) {
//            System.out.print(value + " ");
//        }
//        System.out.println();

        //exercise 5
//        int sum = 0;
//        int product = 1;
//        double average;
//
//        for (int value : array) {
//            sum += value;
//            product *= value;
//        }
//
//        average = (double) sum / array.length;
//
//        System.out.println("Elements:");
//        for (int value : array) {
//            System.out.print(value + " ");
//        }
//        System.out.println();
//
//        System.out.println("Sum: " + sum);
//        System.out.println("Product: " + product);
//        System.out.println("Average: " + average);
//    }

        //exercise 7
        //რაღაც დონემდე მივიყვანე მაგრამ არ იმუშავა, გაკვეთილზე ვნახავ.

        //exercise 8
//        Scanner scanner = new Scanner(System.in);
//        int[] array = {3, 4, 5, 7, 9, 11};
//        System.out.print("Enter target: ");
//        int targetSum = scanner.nextInt();
//
//        boolean pairFound = false;
//
//        for (int i = 0; i < array.length - 1; i++) {
//            for (int j = i + 1; j < array.length; j++) {
//                if (array[i] + array[j] == targetSum) {
//                    System.out.println("Pair found: " + array[i] + " " + array[j]);
//                    pairFound = true;
//                    break;
//                }
//            }
//            if (pairFound) {
//                break;
//            }
//        }
//        if (!pairFound) {
//            System.out.println("No pair found");
//        }

        //exercise 9
//        int[] array = {3, 4, 5, 7, 11, 15};
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Original array: ");
//        for (int value : array) {
//            System.out.print(value + " ");
//        }
//
//        System.out.print("Enter a number to remove: ");
//        int removeNumber = scanner.nextInt();
//
//        int[] newArray = new int[array.length];
//        int index = 0;
//
//        for (int value : array) {
//            if (value == removeNumber) {
//                continue;
//            }
//            newArray[index++] = value;
//        }
//
//        if (index == array.length) {
//            System.out.println("Number not found in the array.");
//        } else {
//            int[] finalArray = new int[index];
//            for (int i = 0; i < index; i++) {
//                finalArray[i] = newArray[i];
//            }
//
//            System.out.print("Updated array: ");
//            for (int value : finalArray) {
//                System.out.print(value + " ");
//            }
//            System.out.println();
//        }

        //exercise 10
        //პირობა დიდად ვერ გავიგე
        //ვერ ვიგებ რატო არ მუშაბს

        Scanner scanner = new Scanner(System.in);
        int[] array = {3, 4, 5, 7, 11, 15};

        System.out.print("Original array: ");
        for (int value : array) {
            System.out.print(value + " ");
        }

        System.out.print("Enter a number to replace with 0: ");

        while (true) {
            boolean allZero = true;
            for (int value : array) {
                if (value != 0) {
                    allZero = false;
                    break;
                }
            }

            if (allZero) {
                System.out.println("All elements are now zero.");
                break;
            }

            int numberToReplace = scanner.nextInt();

            boolean found = false;
            for (int i = 0; i < array.length; i++) {
                if (array[i] == numberToReplace) {
                    array[i] = 0;
                    found = true;
                }
            }

            if (found) {
                System.out.print("Updated array: ");
                for (int value : array) {
                    System.out.print(value + " ");
                }
                System.out.println();
            } else {
                System.out.println("Number not found ");
            }
        }

            scanner.close();
        }
    }
