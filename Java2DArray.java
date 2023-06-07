import java.util.Scanner;

public class Solution {
    private static final int SIZE = 6; // size of the 2D array

    public static void main(String[] args) {
        int[][] arr = new int[SIZE][SIZE];
        Scanner scanner = new Scanner(System.in);

        // Read the input and populate the 2D array
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        scanner.close();

        // Find the maximum hourglass sum
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < SIZE - 2; i++) {
            for (int j = 0; j < SIZE - 2; j++) {
                int sum = calculateHourglassSum(arr, i, j);
                maxSum = Math.max(maxSum, sum);
            }
        }

        System.out.println(maxSum);
    }

    private static int calculateHourglassSum(int[][] arr, int row, int col) {
        int sum = 0;

        // Calculate the sum of the hourglass elements
        sum += arr[row][col];
        sum += arr[row][col + 1];
        sum += arr[row][col + 2];
        sum += arr[row + 1][col + 1];
        sum += arr[row + 2][col];
        sum += arr[row + 2][col + 1];
        sum += arr[row + 2][col + 2];

        return sum;
    }
}
