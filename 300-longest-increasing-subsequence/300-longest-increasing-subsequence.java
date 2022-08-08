class Solution {
    public int lengthOfLIS(int[] nums) {
        int[] data = new int[nums.length];
        Arrays.fill(data, 1);
        int max = 1;
        for (int i=0; i<nums.length; i++) {
            for (int j=0; j<i; j++) {
                if (nums[j]<nums[i])
                    data[i] = Math.max(data[i], data[j]+1);
            }
            max = Math.max(data[i], max);
        }
        return max;        
    }
}