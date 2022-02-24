class Solution 
{
    public int[] twoSum(int[] nums, int target) 
    {
        int[]ans=new int[2];
        int n=nums.length;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            int key=target-nums[i];
            if(map.containsKey(key))
            {
                int idx1=map.get(key);
                ans[0]=idx1;
                ans[1]=i;
                break;
            }
            else
            {
                map.put(nums[i],i);
            }
        }
        return ans;
    }
}