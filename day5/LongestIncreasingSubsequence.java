//https://leetcode.com/problems/longest-increasing-subsequence/submissions/1949863955/

import java.util.Arrays;

public class LongestIncreasingSubsequence {
    
    public int lengthOfLIS(int[] nums) {
        int n=nums.length;
        int dp[]=new int[n];
        Arrays.fill(dp,1);
        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                if(nums[j]<nums[i]){
                    dp[i]=Math.max(dp[i],dp[j]+1);
                }
            }
        }
        System.out.println(Arrays.toString(dp));
        int max=Integer.MIN_VALUE;
        for(int j=0;j<n;j++){
                if(dp[j]>max){
                    max=dp[j];
                }
            }
        return max;
    }
}

