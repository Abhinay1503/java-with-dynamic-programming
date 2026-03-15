public class HouseRobber1 {
   private static int rob(int[] nums) {
        int n = nums.length;
        if(n==1) return nums[0]; 
        if(n==2) return Math.max(nums[1],nums[0]);
        int[] dp = new int[n];
        dp[0]=nums[0];
        dp[1] = Math.max(nums[1],nums[0]);
        for(int i=2;i<n;i++){
            int case1 = dp[i-2]+nums[i];
            int case2 = dp[i-1];
            dp[i]=Math.max(case1,case2);
        }
        return dp[n-1];
        
    }
    public static void main(String[] args) {
        int houses[]={1,2,3,1};
        System.out.println("House robber abhinay robbed houses "+rob(houses));
    }
}
    

