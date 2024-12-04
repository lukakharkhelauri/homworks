import java.util.Scanner;

public class Exercise_5 {
    public static int countZeros(int n) {
        if (n == 0) {
            return 1;
        }

        if (n < 10) {
            return 0;
        }
        return (n % 10 == 0 ? 1 : 0) + countZeros(n / 10);
    }

    public static void checkZeros(int n) {
        int zeroCount = countZeros(n);

        if (zeroCount % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        checkZeros(number);
    }
}
