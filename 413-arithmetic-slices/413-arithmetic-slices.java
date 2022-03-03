class Solution {
    public int calculate(int n){
        int ans = 0;
        for(int k=3;k<=n;k++){
            ans += (n - k + 1);
        }                
        return ans;
    } 
    public int numberOfArithmeticSlices(int[] nums) {
        int n = nums.length;
        int start = 0 , i = 0 , j = 1, diff = Integer.MAX_VALUE;
        int slices = 0;
        while(j < n){
            if(diff == Integer.MAX_VALUE) {
                diff = nums[j] - nums[i];
                i++;
                j++;
            }
            else if(diff != nums[j] - nums[i]){                    
                slices += (calculate(i-start+1));
                diff = Integer.MAX_VALUE;
                start = i;
            }
            else if(diff == nums[j] - nums[i]){
                i++;
                j++;
            }
        }
        slices += calculate(i-start+1);   // calculate the answer for the AP ending at the last index. Eg: [1,2,3,4]     
        return slices;
    }
}