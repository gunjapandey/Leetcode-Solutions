class Solution {
    public int minDeletion(int[] nums) {
        int del=0;
        int n=nums.length;
        for(int i=0;i<n-1;i++)
        {
            int shiftIndex=i-del;
            if(nums[i]==nums[i+1] && shiftIndex%2==0)
                del++;
        }
        if((n-del)%2==1)    del++;
    return del;
    }
    
}
/*
if(nums.length==0)
            return 0;
        int count=0;
        ArrayList<Integer> arr=new ArrayList<Integer>();
        for(int i=0;i<nums.length-1;i++)
        {
            if(i%2==0)
            {
                if(nums[i]==nums[i+1])
                {
                    count++;
                    i++;
                    continue;
                }
                if(nums[i]!=nums[i+1])
                arr.add(nums[i]);
            }
            else
                arr.add(nums[i]);
                
        }
        if(arr.size()%2!=0)
            return 0;
        return count;
        */