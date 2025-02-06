public class SquareRootCalculator {
    public static double calculateSquareRoot(double number) {
        if (number < 0) {
            throw new IllegalArgumentException("negative number");
        }
        return Math.sqrt(number);
    }
}