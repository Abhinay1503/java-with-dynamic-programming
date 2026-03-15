import java.util.Arrays;

public class ClimbingStairs { 
    static int[] dp;
    
    public static int climb(int n) {
        if (n <= 1) return 1;
        if (n == 2) return 2;
        if (dp[n] != -1) return dp[n];
        dp[n] = climb(n - 1) + climb(n - 2);
        return dp[n];
    }
    
    public int climbStairs(int n) {
        dp = new int[n + 1];
        Arrays.fill(dp, -1);
        dp[0] = 1;
        return climb(n);
    }
    
    public static void main(String[] args) {
        ClimbingStairs sol = new ClimbingStairs();
        System.out.println(sol.climbStairs(3));  
        System.out.println(sol.climbStairs(5));  
    }
}
