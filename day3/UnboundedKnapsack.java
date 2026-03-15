import java.util.Arrays;
public class UnboundedKnapsack {
    static int UnboundedKnapsack(int[] weights,int[] values,int capacity){
        int n = values.length;
        int[][] dp = new int[n+1][capacity+1];
        for (int i=1;i<=n;i++){
            for(int j=1;j<=capacity;j++){
                if(weights[i-1]<=j)
                    dp[i][j] = Math.max(values[i-1]+dp[i][j-weights[i-1]], dp[i-1][j]);
                else
                    dp[i][j]=dp[i-1][j];
            }

        }
        for(int i=0;i<dp.length;i++){
        System.out.println(Arrays.toString(dp[i]));
        }
        return dp[n][capacity];
    }
    public static void main(String[] args){
        int[] weigths = {1,2,3};
        int[] values ={1,3,5};
        int capacity = 3;
        int ans=UnboundedKnapsack(weigths,values,capacity);
        System.out.println(ans);
    }
}
