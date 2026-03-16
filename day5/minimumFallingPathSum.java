//https://leetcode.com/problems/minimum-falling-path-sum/
class minimumFallingPathSum {
    public int minimumFallingPathSum(int[][] matrix) {
        int n=matrix.length;
        int dp[][]=new int[n][n];
        for(int i=0;i<n;i++){
            dp[0][i]=matrix[0][i];
        }
        for(int i=1;i<n;i++){
            for(int j=0;j<n;j++){
                int up=dp[i-1][j];
                int upleft=(j>0)?dp[i-1][j-1]:Integer.MAX_VALUE;
                int upright=(j<n-1)?dp[i-1][j+1]:Integer.MAX_VALUE;
                dp[i][j]=Math.min(up,Math.min(upleft,upright))+matrix[i][j];
            }
        }
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(min>dp[n-1][i]) min=dp[n-1][i];
        }
        return min;
    }
}