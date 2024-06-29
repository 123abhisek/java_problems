package sample;
import java.util.Scanner;

public class LongestIncreasingSubsequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of population data points
        int n = scanner.nextInt();
        
        // Read the population counts
        int[] populations = new int[n];
        for (int i = 0; i < n; i++) {
            populations[i] = scanner.nextInt();
        }
        
        // Edge case: if there are no population counts
        if (n == 0) {
            System.out.println(0);
            scanner.close();
            return;
        }
        
        // Array to store the longest increasing subsequence length ending at each index
        int[] dp = new int[n];
        
        // Initialize the dp array with 1 as the minimum length of increasing subsequence
        for (int i = 0; i < n; i++) {
            dp[i] = 1;
        }
        
        // Compute the length of the longest increasing subsequence using DP
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (populations[i] > populations[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }
        
        // Find the maximum value in the dp array which is the result
        int maxLength = 0;
        for (int i = 0; i < n; i++) {
            maxLength = Math.max(maxLength, dp[i]);
        }
        
        // Output the result
        System.out.println(maxLength);
        
        scanner.close();
    }
}
