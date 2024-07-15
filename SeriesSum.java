public class SeriesSum {

    public static void main(String[] args) {
        int n = 5; // Example: Change this value to compute sum for different n
        int sum = computeSeriesSum(n);
        System.out.println("Sum of the series for n = " + n + " is: " + sum);
    }

    // Method to compute the sum of the series
    public static int computeSeriesSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i * (2 * i + 1);
        }
        return sum;
    }
}
