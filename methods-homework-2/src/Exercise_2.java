import java.util.Scanner;

public class Exercise_2 {

    public static int sum(int a, int b, int k) {
        if (a > b) {
            return 0;
        }

        if (a % k == 0) {
            return a + sum(a + 1, b, k);
        }

        return sum(a + 1, b, k);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("a = : ");
        int a = scanner.nextInt();

        System.out.print("b = : ");
        int b = scanner.nextInt();

        System.out.print("k = : ");
        int k = scanner.nextInt();

        int result = sum(a, b, k);
        System.out.println(result);
    }
}
