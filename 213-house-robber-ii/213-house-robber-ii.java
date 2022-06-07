class Solution {
    public int rob(int[] nums) {
        int[] dp=new int[nums.length-1];
        
        if(nums.length==1)
            return nums[0];
        if(nums.length==2)
             return Math.max(nums[0],nums[1]);
        
        dp[0]=nums[0];
        dp[1]=Math.max(nums[0],nums[1]);
        
        //0th index till n-2 index
        for(int index=2;index<nums.length-1;index++)
        {
            dp[index]=Math.max(dp[index-2]+nums[index],dp[index-1]);
        }
        
        //1st index to n-1 index
        int dp1[]=new int[nums.length];
        
        dp1[1]=nums[1];
        dp1[2]=Math.max(nums[1],nums[2]);
        
        for(int index=3;index<nums.length;index++)
        {
            dp1[index]=Math.max(dp1[index-2]+nums[index],dp1[index-1]);
        }
        return Math.max(dp[dp.length-1],dp1[dp1.length-1]);
    }
}