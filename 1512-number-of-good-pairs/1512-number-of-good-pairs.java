class Solution {
    public int numIdenticalPairs(int[] nums) {
        int ct=0;
        int i=0,j=nums.length-1;
        while(i<j)
        {
            if(nums[i]==nums[j])
                ct++;
            j--;
            
            if(j==i)
            {
                j=nums.length-1;
                i++;
            }
            
        }
        return ct;
    }
}