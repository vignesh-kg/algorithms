package problems.dp;
import java.util.Arrays;
public class Fibonacci
{
    public int[] memoizationApproach(int n)
    {
        /*+
          * Initialize dp array with -1
         */
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);
        int[] fibonacciSeries = new int[n];
        for(int i=0;i<n;i++)
        {
            fibonacciSeries[i]=generateFibonacci(i,dp);
        }
        return fibonacciSeries;
    }

    private int generateFibonacci(int n, int[] dp)
    {
        if(n<=1) return n;

        if(dp[n]!=-1) return dp[n];

        dp[n] = generateFibonacci(n-1,dp)+generateFibonacci(n-2,dp);
        return dp[n];
    }

    public int[] tabulationApproach(int n)
    {
        int[] dp = new int[n];
        dp[0] = 0;
        dp[1] = 1;

        for(int i=2; i<n;i++)
        {
            dp[i] = dp[i-1] + dp[i-2];
        }

        return dp;
    }
}